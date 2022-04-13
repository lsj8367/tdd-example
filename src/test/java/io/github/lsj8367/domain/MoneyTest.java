package io.github.lsj8367.domain;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoneyTest {

    private Dollar five;

    @BeforeEach
    void setUp() {
        five = new Dollar(5);
    }

    @Test
    @DisplayName("Dollar 객체에 times 횟수만큼 곱하면 곱셈이 된다.")
    void testMultiplication() {
        five = five.times(2);
        assertThat(five.amount).isEqualTo(10);
    }

    @Test
    @DisplayName("곱해주면 새로운 값을 가지는 불변객체를 만든다.")
    void multipleContinue() {
        Dollar product = five.times(2);
        assertThat(product.amount).isEqualTo(10);

        product = five.times(3);
        assertThat(product.amount).isEqualTo(15);
    }

}
