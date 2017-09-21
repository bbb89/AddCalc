package com.lukasz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	    while(true) {
	        String operationAsString;
            System.out.println("Write your operation (or \"exit\" to end program):");
            operationAsString = scanner.nextLine();
            if (operationAsString.equals("exit")) {
                break;
            }

            Operation currentOperation = new Operation(operationAsString);
            if (currentOperation.getOperationType() == OperationType.NONE) {
                System.out.println("Invalid operation");
                continue;
            }
            MathProcessor mathProcessor = new MathProcessor(currentOperation);

            System.out.print("Result is: ");
            System.out.println(mathProcessor.doMath());
        }
    }
}
