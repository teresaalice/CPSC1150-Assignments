// ************************************************************************************************
//   Midterm 1 - Program Design
//   Program name: ExamQ2.java from TSilva100350471.zip
//   Student name: Teresa Alice Alves e Silva
//   Student ID: 100350471
//   Session: W01
//   Date: 06/11/2020
//   Program Description: The following program reads a positive integer between 0 and 9999
//   and outputs the number as a combination of powers of 10.
//
//   Example: 1304 = 1*10^3 + 3*10^2 + 0*10^1 + 4*10^0
// ************************************************************************************************

import java.util.Scanner;

public class ExamQ2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int userInput = input.nextInt();
        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;
        int fourthDigit = 0;

        if (!(userInput < 0) || (userInput > 9999))
        {
            int number = userInput;
            if (number > 1000)
            {
                firstDigit = number / 1000;
                number -= firstDigit*1000;
            }

            if (number > 100)
            {
                secondDigit = number / 100;
                number -= secondDigit*100;
            }

            if (number > 10)
            {
                thirdDigit = number / 10;
                number -= thirdDigit*10;
            }

            fourthDigit = number;

            System.out.print(userInput + " = ");
            System.out.print(firstDigit + "*10^3 + ");
            System.out.print(secondDigit + "*10^2 + ");
            System.out.print(thirdDigit + "*10^1 + ");
            System.out.print(fourthDigit + "*10^0");
        }
        else
        {
            System.out.println("Error! Number must be between 0 and 9999. Try again.");
        }
        input.close();
    }
}