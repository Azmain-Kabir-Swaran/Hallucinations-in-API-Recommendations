package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class MyClass {
    private LocalDate localDate;
    private int someProperty;

    public MyClass(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void callMethod() {
        someProperty = localDate.plusDays(5).getDayOfMonth();
    }

    public int getSomeProperty() {
        return someProperty;
    }
}