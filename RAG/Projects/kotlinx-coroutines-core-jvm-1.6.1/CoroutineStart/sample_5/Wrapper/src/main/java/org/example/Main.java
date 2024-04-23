package org.example;


import kotlinx.coroutines.CoroutineStart;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Main {

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Task running on thread " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        // You will need to ensure the provided Runnable task starts coroutine
        MyRunnable task = new MyRunnable();
        executorService.submit(task);

        executorService.shutdown();
    }
}