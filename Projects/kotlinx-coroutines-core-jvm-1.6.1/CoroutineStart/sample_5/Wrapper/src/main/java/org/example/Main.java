package org.example;


import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.CoroutineStart;

public class Main {
    public static void main(String[] args) {
        CoroutineScope scope = new CoroutineScope(Dispatchers.Default);

        Job job = scope.coroutineContext.getOrThrow(Job.Key);

        job.start(CoroutineStart.LAZY);
    }
}