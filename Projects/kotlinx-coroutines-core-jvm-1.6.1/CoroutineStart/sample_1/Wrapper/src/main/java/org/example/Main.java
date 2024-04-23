package org.example;


import kotlinx.coroutines.CoroutineScope;
import kotlinxCoroutineContext;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.Continuation;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    private static final AtomicReference<Continuation<? super String>> continuation = new AtomicReference<>();

    public static void main(String[] args) throws Exception {
        new JavaClassFunction().function(new Continuation<String>() {
            @Override
            public void resumeWith(Object result) {
                if (continuation.compareAndSet(null, this)) {
                    Continuation<Object> c = (Continuation<Object>) continuation.get();
                    c.resume(result);
                } else {
                    Continuation<Object> c = (Continuation<Object>) continuation.get();
                    c.resume(result);
                }
            }

            @Override
            public CoroutineContext context() {
                return CoroutineScope(context).getCoroutineContext();
            }
        });
    }
}