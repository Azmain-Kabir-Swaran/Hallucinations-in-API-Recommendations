package org.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

class Main {

    @Mock
    private SomeService service;

    @InjectMocks
    private MainUnderTest main;

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(true, new int[]{1}),
                Arguments.of(false, new int[]{2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testMainMethod(boolean isConditionTrue, int[] expectedOutput) {
        when(service.methodThatReturnsList(anyList())).thenReturn(Arrays.asList(expectedOutput));
        assertThat(main.mainMethod()).containsAll(Arrays.asList(expectedOutput));
    }
}