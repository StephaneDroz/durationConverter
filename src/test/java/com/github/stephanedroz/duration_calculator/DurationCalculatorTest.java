package com.github.stephanedroz.duration_calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DurationCalculatorTest {

    @Test
    void convertTimeToHoursWithColon() {
        var calculator = new DurationCalculator();
        String converted1 = calculator.convertTime("16:59");
        assertThat(converted1).isEqualTo("16.98");
        String converted2 = calculator.convertTime("01:30");
        assertThat(converted2).isEqualTo("1.5");
    }

    @Test
    void convertTimeToHoursWithH() {
        var calculator = new DurationCalculator();
        String converted1 = calculator.convertTime("16h59");
        assertThat(converted1).isEqualTo("16.98");
        String converted2 = calculator.convertTime("01h30");
        assertThat(converted2).isEqualTo("1.5");
    }

    @Test
    void convertHoursToTime() {
        var calculator = new DurationCalculator();
        String converted1 = calculator.convertTime("16.98");
        assertThat(converted1).isEqualTo("16:59");
        String converted2 = calculator.convertTime("1.5");
        assertThat(converted2).isEqualTo("01:30");
    }

}