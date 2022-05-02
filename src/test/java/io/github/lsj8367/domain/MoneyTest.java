package io.github.lsj8367.domain;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MoneyTest {

    @ParameterizedTest
    @MethodSource
    @DisplayName("객체값 같은지 비교")
    void equalityTest(final Object actual, final Object expected) {
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> equalityTest() {
        return Stream.of(
            Arguments.of(Money.dollar(5), Money.dollar(5)),
            Arguments.of(Money.franc(5), Money.franc(5))
        );
    }

    @ParameterizedTest
    @MethodSource
    @DisplayName("객체 값 다른지 비교")
    void notEqualityTest(final Object actual, final Object expected) {
        assertThat(actual).isNotEqualTo(expected);
    }

    private static Stream<Arguments> notEqualityTest() {
        return Stream.of(
            Arguments.of(Money.dollar(5), Money.dollar(6)),
            Arguments.of(Money.franc(5), Money.franc(6)),
            Arguments.of(Money.franc(5), Money.dollar(5))
        );
    }

    @Test
    void testCurrency() {
        assertThat("USD").isEqualTo(Money.dollar(1).currency());
        assertThat("CHF").isEqualTo(Money.franc(1).currency());
    }
}