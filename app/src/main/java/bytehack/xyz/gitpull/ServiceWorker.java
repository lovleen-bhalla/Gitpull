package bytehack.xyz.gitpull;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

import bytehack.xyz.gitpull.workers.Task;
import bytehack.xyz.gitpull.workers.Worker;

public class ServiceWorker implements Worker {

    private final String name;

    private final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());

    private HandlerThread mThread;
    private Handler mHandler;
    private boolean isDestroyed = true;

    public ServiceWorker(String name) {
        this.name = name;
        createWorker();
    }

    @Override
    public void createWorker() {
        if (!isDestroyed) {
            return;
        }
        isDestroyed = false;
        mThread = new HandlerThread(String.format("%s WorkerThread", name));
        mThread.start();
        mHandler = new Handler(mThread.getLooper());
    }

    @Override
    public void destroy() {
        isDestroyed = true;
        mHandler.getLooper().quitSafely();
        mThread = null;
    }

    @Override
    public <T> void addTask(Task<T> t) {
        if (isDestroyed) {
            return;
        }
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                final T result = t.execute();
                if (isDestroyed) {
                    return;
                }
                MAIN_HANDLER.post(new Runnable() {
                    @Override
                    public void run() {
                        t.onComplete(result);
                    }
                });
            }
        });
    }
}
