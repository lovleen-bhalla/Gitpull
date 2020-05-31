package bytehack.xyz.gitpull.workers;

import bytehack.xyz.gitpull.workers.Task;

public interface Worker {

    void createWorker();

    void destroy();

    <T> void addTask(Task<T> t);
}
