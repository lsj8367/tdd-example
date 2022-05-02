package io.github.lsj8367.domain;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FrancTest {

    @Test
    @DisplayName("franc 곱셈 테스트")
    void testFrancMultiplication() {
        Franc franc = new Franc(5, "CHF");
        assertThat(franc.times(2)).isEqualTo(Money.franc(10));
        assertThat(franc.times(3)).isEqualTo(Money.franc(15));
    }

}
