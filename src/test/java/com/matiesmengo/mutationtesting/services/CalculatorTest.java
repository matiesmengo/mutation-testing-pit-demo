package com.matiesmengo.mutationtesting.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
    @InjectMocks
    private Calculator calculator;

    @Test
    public void addition_shouldAdditionParameters() {
        assertEquals(4, this.calculator.addition(2, 2));
    }

    @Test
    public void subtraction_shouldSubtractionParameters() {
        assertEquals(6, this.calculator.subtraction(8, 2));
    }

    @Test
    public void multiplication_shouldMultiplicationParameters() {
        assertEquals(1, this.calculator.multiplication(1, 1));
    }

    @Test
    public void division_shouldDivisionParameters() {
        assertEquals(5, this.calculator.division(40, 8));
    }
}