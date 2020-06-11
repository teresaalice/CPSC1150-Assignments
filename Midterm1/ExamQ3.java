// ************************************************************************************************
//   Midterm 1 - Program Design
//   Program name: ExamQ3.java from TSilva100350471.zip
//   Student name: Teresa Alice Alves e Silva
//   Student ID: 100350471
//   Session: W01
//   Date: 06/11/2020
//   Program Description: The following program reads a sequence of numbers from the user.
//   When the user provides a number that's different than the previous one, it prints out
//   a number in the form m(n), where m is the number that was provided before and n is the
//   number of times it was repeated. Program stops when user provides a number that is smaller
//   than the previous number after printing the last result.
//
// ************************************************************************************************

import java.util.Scanner;
public class ExamQ3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the numbers by ascending order (smaller number to stop):");
        int userInput = input.nextInt();

        int previousNumber = userInput;
        int counter = 0;
        do
        {
            if (userInput != previousNumber){
                System.out.println(previousNumber + "(" + counter + ")");
                previousNumber = userInput;
                counter = 1;
            }
            else
            {
                counter++;
            }
            userInput = input.nextInt();
        } while (userInput >= previousNumber);

        System.out.println(previousNumber + "(" + counter + ")");

        input.close();
    }
}