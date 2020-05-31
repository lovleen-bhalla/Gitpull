package bytehack.xyz.gitpull.workers;

import androidx.annotation.UiThread;

public interface Task<T> {
    T execute();

    @UiThread
    void onComplete(T t);
}
