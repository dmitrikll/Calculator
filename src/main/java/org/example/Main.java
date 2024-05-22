package org.example;

public class Main {
    public static void main(String[] args) {

        double num1;
        String operator;
        double num2;
        double result;

        try {
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number: " + e.getMessage() + "\nPlease enter first num, operator, second num.");
            return;
        }

        operator = args[1];

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    break;
                }
                System.out.println("Cannot divide by zero!");
                return;
            case "^":
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Invalid operator: " + operator);
                return;
        }

        System.out.println("Result: \n" + num1 + " " + operator + " " + num2 + " = " + result);
    }
}