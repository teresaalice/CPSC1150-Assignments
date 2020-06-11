// ************************************************************************************************
//   Midterm 1 - Program Design
//   Program name: ExamQ1.java from TSilva100350471.zip
//   Student name: Teresa Alice Alves e Silva
//   Student ID: 100350471
//   Session: W01
//   Date: 06/11/2020
//   Program Description: The following program reads one positive integer number. It then finds
//   and outputs the largest odd number that is smaller than the provided number and that is evenly
//   divisible by 5 but not evenly divisible by 3.
//
//
// ************************************************************************************************

import java.util.Scanner;

public class ExamQ1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int userInput = input.nextInt();
        
        int number = 1;
        int biggestResult = 0;

        while (number < userInput)
        {
            if ((number % 2 != 0) && (number % 5 == 0) && (number % 3 != 0))
            {
                biggestResult = number;
            }
            number++;
        }

        System.out.println("The biggest odd number smaller than " + userInput + " that is divisible by 5 but not by 3 is: " + biggestResult);
        input.close();
    }
}