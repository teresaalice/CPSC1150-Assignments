import java.util.Locale;
import java.util.Scanner;
import java.text.*;

public class Tax {
    public static void main (String[] args){
        
        double incomeTax = 0;
        double incomeTotal;
        double minIncome = 106600;
        double firstRateIncome = 38210.00;
        double firstRateTax = 5.06;
        double secondRateIncome = 38210.99;
        double secondRateTax = 7.70;
        double thirdRateIncome = 11319.99;
        double thirdRateTax = 10.50;
        double fourthRateIncome = 18801.99;
        double fourthRateTax = 12.29;
        double finalRateIncome;
        double finalRateTax = 14.70;
        double totalTax = 0;

        Scanner scan = new Scanner(System.in);
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.CANADA);

        // Prompts the user to enter a yearly salary amount that is greater than 
        System.out.print("Please enter a salary greater than $" + numberFormat.format(minIncome) + ": ");
        incomeTotal = scan.nextDouble();

        if (incomeTotal >= minIncome) {

            //Considering that only values above 106600 will be considered, the first 4 tax rates have fixed values for income
            //Only in the final calculation we'll be using the user input

            //Calculates and prompts out the first tax rate and adds the calculated tax to the total tax
            incomeTax = firstRateIncome*(firstRateTax/100);
            System.out.println("$" + numberFormat.format(firstRateIncome) + " at " + numberFormat.format(firstRateTax) + "% : " + numberFormat.format(incomeTax));
            totalTax = incomeTax;

            //Calculates and prompts out the second tax rate and adds the calculated tax to the total tax
            incomeTax = secondRateIncome*(secondRateTax/100);
            System.out.println("$" + numberFormat.format(secondRateIncome) + " at " + numberFormat.format(secondRateTax) + "% : " + numberFormat.format(incomeTax));
            totalTax = totalTax + incomeTax;

            //Calculates and prompts out the third tax rate and adds the calculated tax to the total tax
            incomeTax = thirdRateIncome*(thirdRateTax/100);
            System.out.println("$" + numberFormat.format(thirdRateIncome) + " at " + numberFormat.format(thirdRateTax) + "% : " + numberFormat.format(incomeTax));
            totalTax = totalTax + incomeTax;

            //Calculates and prompts out the fourth tax rate and adds the calculated tax to the total tax
            incomeTax = fourthRateIncome*(fourthRateTax/100);
            System.out.println("$" + numberFormat.format(fourthRateIncome) + " at " + numberFormat.format(fourthRateTax) + "% : " + numberFormat.format(incomeTax));
            totalTax = totalTax + incomeTax;

            //Calculates and prompts out the final tax rate and adds the calculated tax to the total tax
            //The final tax rate is only considered for the remaining amount after subtracting the other ones
            finalRateIncome = (incomeTotal - (firstRateIncome + secondRateIncome + thirdRateIncome + fourthRateIncome));
            incomeTax = finalRateIncome*(finalRateTax/100);
            System.out.println("$" + numberFormat.format(finalRateIncome) + " at " + numberFormat.format(finalRateTax) + "% : " + numberFormat.format(incomeTax));
            totalTax = totalTax + incomeTax;

            //Prompts out the final tax amount after all the calculations
            System.out.println("Your total income tax: $" + numberFormat.format(totalTax));
        } else {
            //Prompts out the final tax amount after all the calculations
            System.out.println("Error. Income not greater than $" + numberFormat.format(minIncome) + "! Please try again.");
        }

    scan.close();
    }
}