package io.github.lsj8367.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.assertj.core.api.Assertions;
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
        assertThat(five).isEqualTo(new Dollar(10));
    }

    @Test
    @DisplayName("곱해주면 새로운 값을 가지는 불변객체를 만든다.")
    void multipleContinue() {
        Dollar product = five.times(2);
        assertThat(product).isEqualTo(new Dollar(10));

        product = five.times(3);
        assertThat(product).isEqualTo(new Dollar(15));
    }

    @Test
    @DisplayName("객체끼리 값을 비교한다.")
    void equalTest() {
        assertAll(
            () -> assertThat(five).isEqualTo(new Dollar(5)),
            () -> assertThat(five).isNotEqualTo(new Dollar(6))
        );
    }

}
