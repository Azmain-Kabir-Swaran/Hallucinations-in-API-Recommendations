package org.example;

import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class SampleClass {

    private SampleInterface sample;

    public SampleClass(SampleInterface sample) {
        this.sample = sample;
    }

    public String print() {
        return sample.doSomething();
    }
}