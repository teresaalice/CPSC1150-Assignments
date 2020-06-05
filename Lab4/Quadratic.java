import java.util.Scanner;

public class Quadratic {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println ("Quadratic Equation Calculator");
        System.out.println();
        //Prompts user for 3 numbers, each divided by a space or enter
        System.out.print("Please enter numerical values for a, b and c respectively:" );
        double aInput = scan.nextDouble();
        double bInput = scan.nextDouble();
        double cInput = scan.nextDouble();

        // Calculates the value of b² - 4ac, which determines how many roots the equation has
        double deltaValue = Math.pow(bInput, 2) - 4*aInput*cInput;
        double root;
        double secondRoot;

        //In case a is equal to zero, uses the x = -(c/b) formula to avoid division by 0
        //otherwise calculates the roots for each case
        if(aInput == 0){
            root = -(cInput/bInput);
            System.out.print("This equation has one real root. x = " + root);
        }
        else if (deltaValue > 0){
            root = (-bInput + Math.sqrt(deltaValue)) / (2 * aInput);
            secondRoot = (-bInput - Math.sqrt(deltaValue)) / (2 * aInput);

            System.out.print("This equation has two real roots. x1 = " + root + " and x2 = " + secondRoot);
        } else if(deltaValue == 0){
            root = (-bInput) / (2 * aInput);
            System.out.print("This equation has one real root. x = " + root);
        } else{
            System.out.print("This equation has no real roots.");
        }
        scan.close();
    }
}