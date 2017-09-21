package com.lukasz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathProcessorTest {
    private Operation operation;
    private MathProcessor mathProcessor;

    @Test
    public void doMath_addingTest() {
        operation = new Operation("5+10");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 15;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_substractingTest_firstArgIsBigger() {
        operation = new Operation("10-5");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 5;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_substractingTest_secondArgIsBigger() {
        operation = new Operation("10-15");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = -5;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_multiplyingTes_firstArgIsBiggert() {
        operation = new Operation("10*5");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 50;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_multiplyingTest_secondArgIsBigger() {
        operation = new Operation("5*8");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 40;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_multiplyingTest_zero() {
        operation = new Operation("5*0");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 0;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_divideTest_firstArgIsBigger1() {
        operation = new Operation("10/5");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 2;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_divideTest_firstArgIsBigger2() {
        operation = new Operation("24/5");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 4;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_divideTest_firstArgIsBigger3() {
        operation = new Operation("5/5");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 1;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_divideTest_secondArgIsBigger() {
        operation = new Operation("5/8");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 0;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_expotentationTest_2_0() {
        operation = new Operation("2^0");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 1;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_expotentationTest_2_1() {
        operation = new Operation("2^1");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 2;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_expotentationTest_2_2() {
        operation = new Operation("2^2");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 4;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_expotentationTest_2_3() {
        operation = new Operation("2^3");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 8;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_expotentationTest_3_3() {
        operation = new Operation("3^3");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 27;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_expotentationTest_1_2() {
        operation = new Operation("1^2");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 1;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

    @Test
    public void doMath_expotentationTest_1_3() {
        operation = new Operation("1^3");
        mathProcessor = new MathProcessor(operation);
        int expectedResult = 1;

        assertEquals(expectedResult, mathProcessor.doMath());
    }

}