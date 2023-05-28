package com.example.incubyteassignment.servicetest;

import com.example.incubyteassignment.service.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals(2, StringCalculator.add("2"));
    }

    @Test
    public void testTwoCharacters() {
        assertEquals(3, StringCalculator.add("1,2"));
    }
}
