/*
    Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
    Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
    Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string
 */

import java.util.Scanner;

public class Program_1{
    public static double addition(double a, double b){
        return a + b;
    }
    public static double subtraction(double a, double b){
        return a - b;
    }
    public static double multiplication (double a, double b){
        return a * b;
    }
    public static double division(double a, double b){
        return a / b;
    }

    public static double calculate(double a, double b, String operation){
        double result = 0;
        switch (operation){
            case "+":
                result = addition(a, b);
                break;

            case "-":
                result = subtraction(a, b);
                break;

            case "*":
                result = multiplication(a, b);
                break;

            case "/":
                result = division(a, b);
                break;

            default:
                System.err.println("Invalid Operation!! Please, enter a valid operator..");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st number(a): ");
        double a = input.nextDouble();
        System.out.print("Enter your 2nd number(b): ");
        double b = input.nextDouble();
        System.out.print("Enter your operator('+' or '-' or '*' or '/'): ");
        String operation = input.next();

        double result = calculate(a, b, operation);
        System.out.println("result: " + result);
    }
}