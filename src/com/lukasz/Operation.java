package com.lukasz;

public class Operation {
    private int firstArgument;
    private int secondArgument;
    private OperationType operationType;

    private String[] operationsTable = { "+", "-", "*", "/", "^" };
    private String currentOperation = "";

    public Operation(String operationAsString) {
        operationType = readOperation(operationAsString);

        if (operationType != OperationType.NONE) {
            readArguments(operationAsString);
        }
    }

    private OperationType readOperation(String operationAsString) {
        for (int i = 0; i < 5; i++) {
            if (operationAsString.contains(operationsTable[i])) {
                currentOperation = operationsTable[i];
                break;
            }
        }

        switch (currentOperation) {
            case "+":
                return OperationType.ADD;
            case "-":
                return OperationType.SUBSTRACT;
            case "*":
                return OperationType.MULTIPLY;
            case "/":
                return OperationType.DIVIDE;
            case "^":
                return OperationType.EXPOTENTATION;
        }

        return OperationType.NONE;
    }

    private void readArguments(String operationAsString) {
        int indexOfOperationSign = operationAsString.indexOf(currentOperation);
        try {
            this.firstArgument = Integer.valueOf(operationAsString.substring(0, indexOfOperationSign));
            this.secondArgument = Integer.valueOf(operationAsString.substring(indexOfOperationSign+1));
        }catch (NumberFormatException e) {
            operationType = OperationType.NONE;
        }
        if(operationType == OperationType.DIVIDE && this.secondArgument == 0) {
            operationType = OperationType.NONE;
        }

    }

    public int getFirstArgument() {
        return firstArgument;
    }

    public int getSecondArgument() {
        return secondArgument;
    }

    public OperationType getOperationType() {
        return operationType;
    }


}
