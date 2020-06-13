import java.util.Scanner;

public class Stars {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number an odd number: ");
        int userInput = scan.nextInt();

        int i;
        int j;
        int k;

        if (userInput % 2 != 0) //checks if number is odd
        {
            for (i = 0; i < userInput; i++) // loop for rows
            { 
                j = userInput - 1 - i;
                for (k = 0; k < userInput; k++) // loop for colums
                {
                    if (k == i || k == j){  // rows and colums are the same, prints a star
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Error! The number provided must be an odd number. Please try again.");
        }
    scan.close();
    }
}