/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Peter Perri
 */

/*
Exercise:
Write a program that prompts for two numbers.
Print the sum, difference, product, and quotient
of those numbers as shown in the example output:
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Pseudocode:
create a new scanner called 'input'
declare two int variables, 'firstNum' and 'secondNum'
declare four more int variables, 'sum', 'diff, 'prod', and 'quot'
prompt the user for the first number
assign the value to 'firstNum', ensuring that it is an int
prompt the user for the second number
assign the value to 'secondNum', ensuring that it is an int

 */

import java.util.Scanner;
public class Solution05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int firstNum, secondNum;
        int sum, diff, prod, quot;

        System.out.println("What is the first number? ");
        firstNum = input.nextInt();
        System.out.println("What is the second number? ");
        secondNum = input.nextInt();

        sum = firstNum + secondNum;
        diff = firstNum - secondNum;
        prod = firstNum * secondNum;
        quot = firstNum / secondNum;

        System.out.printf(
                "%d + %d = %d\n" +
                "%d - %d = %d\n" +
                "%d * %d = %d\n" +
                "%d / %d = %d",
                firstNum, secondNum, sum, firstNum, secondNum, diff, firstNum, secondNum, prod, firstNum, secondNum, quot);


    }
}
