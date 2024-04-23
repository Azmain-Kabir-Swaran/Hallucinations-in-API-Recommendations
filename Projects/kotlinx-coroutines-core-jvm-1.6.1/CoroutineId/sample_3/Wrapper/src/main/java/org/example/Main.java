package org.example;


import kotlinx.coroutines.Job;
import kotlinx.sequential.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Job job = Job();
        SequentialCoroutineDispatcher dispatcher = new SequentialCoroutineDispatcher();
        Job child = Job(job);
        CompletableFuture<String> future = new CompletableFuture<String>();

        // Use CoroutineId
        CoroutineId coroutineId = CoroutineId.lookup(job.toString());
    }
}