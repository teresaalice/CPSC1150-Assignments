import java.util.Scanner;

public class CubesSum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

        System.out.println("Sum of cubes");

        //Ask the user the enter the first number and press enter
		System.out.println("Please enter the first number");
		double firstNumber = input.nextDouble();
	
		//Ask the user to enter the secondnumber and press enter
		System.out.println("Please enter the second number");
		double secondNumber = input.nextDouble();
    
        //Calculates the sum of the cubes
        double total = (Math.pow(firstNumber, 3)) + (Math.pow(secondNumber, 3));
		
		//Print out the result for the user
		System.out.println("The sum of the cubes is" + total);
		
		input.close();
	}

}