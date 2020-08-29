package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculating {

    public static void main(String[] args) {

        Calculating calculating = new Calculating();
        calculating.processInput();
    }

    public void processInput(){
        int no1 = 0;
        int no2 = 0;
        String operator = "";
        boolean validOperatorEntered = false;

        Scanner scanner = new Scanner(System.in);

        while (true){
            try{
                System.out.print("Enter a first Number: ");
                no1 = scanner.nextInt();
                scanner.nextLine();
                break;
            }catch (InputMismatchException ex){
                System.out.println("Number must be numeric!!!");
                scanner.nextLine();
            }
        }

        while (validOperatorEntered == false){
            System.out.print("/nEnter the operator + - * / %: ");
            operator = scanner.nextLine();

            switch (operator){
                case "+":
                    validOperatorEntered = true;
                    break;
                case "-":
                    validOperatorEntered = true;
                    break;
                case "*":
                    validOperatorEntered = true;
                    break;
                case "/":
                    validOperatorEntered = true;
                    break;
                case "%":
                    validOperatorEntered = true;
                    break;
                default:
                    System.out.println("Invalid Operator!");
            }

        }

        while (true){
            try{
                System.out.print("\nEnter the second number: ");
                no2 = scanner.nextInt();
                scanner.nextLine();
                break;
            }catch (InputMismatchException ex){
                System.out.println("Number must be numeric: ");
                scanner.nextLine();
            }
        }
        Calculator calculator = new Calculator();
        calculator.setNo1(no1);
        calculator.setNo2(no2);
        calculator.setOperate(operator);
        System.out.println("\n");
        System.out.println("Result: " + calculator.performCalculationn());
    }
}

