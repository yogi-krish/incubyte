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

    @Test
    public void testMultipleCharacter() {
        assertEquals(15, StringCalculator.add("1,2,3,4,5"));
    }

    @Test
    public void testNewLineDelimiter() {
        assertEquals(10, StringCalculator.add("1/n2,3/n4"));
    }

    @Test
    public void testdifferentDelimiters() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test
    public void testformultipleNegatives() {
        try {
            StringCalculator.add("-1,-2,3");

        }
        catch(RuntimeException e) {
            assertEquals("negatives not allowed -1 -2", e.getMessage());
        }
    }
}
