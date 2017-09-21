package com.lukasz;

public class MathProcessor {
    private Operation operation;

    public MathProcessor(Operation operation) {
        this.operation = operation;
    }

    public int doMath() {
        switch (operation.getOperationType()) {
            case ADD:
                return add();
            case SUBSTRACT:
                return substract();
            case MULTIPLY:
                return multiply();
            case DIVIDE:
                return divide();
            case EXPOTENTATION:
                return expotentation();
        }

        return 0;
    }

    private int add() {
        return operation.getFirstArgument() + operation.getSecondArgument();
    }

    private int substract() {
        int first = operation.getFirstArgument();
        int second = operation.getSecondArgument();
        int result = 0;

        if (first > second) {
            while(first > second) {
                second++;
                result++;
            }
        }else {
            while(first < second) {
                first++;
                result--;
            }
        }

        return result;
    }

    private int multiply() {
        int first = operation.getFirstArgument();
        int second = operation.getSecondArgument();
        int result = 0;

        for(int i = 0; i < second; i++) {
            result += first;
        }

        return result;
    }

    private int divide() {
        int first = operation.getFirstArgument();
        int second = operation.getSecondArgument();

        if (first < second) return 0;

        int result = 1;

        while(first > second) {
            second += second;
            result++;
        }

        return result;
    }

    private int expotentation() {
        int first = operation.getFirstArgument();
        int second = operation.getSecondArgument();
        if (second == 0) return 1;
        int result = first;

        for (int i = 1; i < second; i++) {
            int currentMultiplier = result;
            for (int j = 1; j < first; j++) {
                result += currentMultiplier;
            }
        }

        return result;
    }

}
