package com.lukasz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {
    private Operation operation;

    @Test
    public void constructor_operationType_add() {
        operation = new Operation("5+1");
        OperationType expectedOperationType = OperationType.ADD;
        assertEquals(expectedOperationType, operation.getOperationType());
    }

    @Test
    public void constructor_operationType_substract() {
        operation = new Operation("5-1");
        OperationType expectedOperationType = OperationType.SUBSTRACT;
        assertEquals(expectedOperationType, operation.getOperationType());
    }

    @Test
    public void constructor_operationType_multiply() {
        operation = new Operation("5*1");
        OperationType expectedOperationType = OperationType.MULTIPLY;
        assertEquals(expectedOperationType, operation.getOperationType());
    }

    @Test
    public void constructor_operationType_divide() {
        operation = new Operation("5/1");
        OperationType expectedOperationType = OperationType.DIVIDE;
        assertEquals(expectedOperationType, operation.getOperationType());
    }

    @Test
    public void constructor_operationType_expotentation() {
        operation = new Operation("5^1");
        OperationType expectedOperationType = OperationType.EXPOTENTATION;
        assertEquals(expectedOperationType, operation.getOperationType());
    }

    @Test
    public void constructor_invalidOperation() {
        operation = new Operation("5^1+1");
        OperationType expectedOperationType = OperationType.NONE;
        assertEquals(expectedOperationType, operation.getOperationType());
    }


    @Test
    public void constructor_firstArg_int() {
        operation = new Operation("5+1");
        int expectedFirstArg = 5;
        assertEquals(expectedFirstArg, operation.getFirstArgument());
    }

    @Test
    public void constructor_secondArg_int() {
        operation = new Operation("5+1");
        int expectedSecondArg = 1;
        assertEquals(expectedSecondArg, operation.getSecondArgument());
    }
}