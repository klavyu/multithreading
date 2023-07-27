package org.example2;

import java.util.ArrayList;
import java.util.List;

public class MultiExecuter {
    private final List<Runnable> tasks;

    public MultiExecuter(List<Runnable> tasks) {
        this.tasks = tasks;
    }

    public void executeAll(){
        List<Thread> threads = new ArrayList<>(tasks.size());
        for (Runnable r: tasks
             ) {
            Thread thread = new Thread(r);
            threads.add(thread);
        }
        for (Thread t: threads
             ) {
            t.start();
        }
    }
}
