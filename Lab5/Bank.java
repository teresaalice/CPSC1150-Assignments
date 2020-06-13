//reads a number from the user (initial balance of bank account)
//program determines how many years and months it takes for bank account to deplete
//interest is added to the account at the start of every month at 0.5
//at the end of every month 500 is taken from the account to pay rent
//depleted when balance is less than 500

import java.util.Scanner;

public class Bank {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance:");
        double balanceInput = input.nextDouble();
        int monthCount = 1;
        int yearCount = 0;

        while ((balanceInput - 500) >= 0)
        {
            balanceInput = balanceInput*1.005;  // adds interest of 0.5
            balanceInput -= 500;                // take rent from the account
            monthCount++;                       // adds another month to the count

            if (monthCount >= 12){              // converts 12 months into a year
                monthCount -= 12;
                yearCount++;
            }
        }

        //prints result to user

        if (yearCount > 0){
            if(yearCount == 1){
                System.out.print(yearCount + " year");
            }
            else{
                System.out.print(yearCount + " years");
            }
        }

        if ((yearCount > 0) && (monthCount > 0)){       // if there are values for both month and year, adds "and"
            System.out.print(" and ");
        }

        if (monthCount > 0){
            if (monthCount == 1){
                System.out.print(monthCount + " month");
            }
            else{
                System.out.print(monthCount + " months");
            }
        }
        input.close();
    }
}