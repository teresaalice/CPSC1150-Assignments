import java.util.Scanner;

public class Quadratic {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println ("Quadratic Equation Calculator");
        System.out.println();
        //Prompts user for a string
        System.out.print("Please enter numerical values for a, b and c respectively:" );
        Double aInput = scan.nextDouble();
        Double bInput = scan.nextDouble();
        Double cInput = scan.nextDouble();

        // Calculates the value of
        Double deltaValue = bInput*bInput - 4*aInput*cInput;

        if (deltaValue > 0){
            Double firstRoot = (-bInput + Math.pow(deltaValue, 1/2)) / (2 * aInput);
            Double secondRoot = (-bInput - Math.pow(deltaValue, 1/2)) / (2 * aInput);

            System.out.print("This equation has two real roots. x1 = " + firstRoot + " and x2 = " + secondRoot);
        } else if(deltaValue == 0){
            Double root = (-bInput) / (2 * aInput);
            System.out.print("This equation has one real root. x = " + root);
        } else{
            System.out.print("This equation has no real roots.");
        }
        scan.close();
    }
}