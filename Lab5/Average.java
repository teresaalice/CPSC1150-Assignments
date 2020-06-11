// The program reads an integer number from the user until a negative value is provided
//It then outputs the average of the numbers, not including the negative number


import java.util.Scanner;

public class Average {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some numbers (a negative to stop):");
        int userInput = input.nextInt();

        int numberSum = 0;
        int numberCount = 0;
        double numberAvg;

        if(userInput > 0){
            do{
                numberSum += userInput;
                numberCount++;
                userInput = input.nextInt();
            } while (userInput > 0);
            numberAvg = (double) numberSum / numberCount;
            System.out.println("Average: " + numberAvg);
        } else {
            System.out.println("Error: No positive numbers provided!");
        }
        input.close();
    }
}