package io.github.lsj8367.domain;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FrancTest {

    @Test
    @DisplayName("franc 곱셈 테스트")
    void testFrancMultiplication() {
        Money franc = Money.dollar(5);
        assertThat(franc.times(2)).isEqualTo(Money.dollar(10));
        assertThat(franc.times(3)).isEqualTo(Money.dollar(15));
    }

}
