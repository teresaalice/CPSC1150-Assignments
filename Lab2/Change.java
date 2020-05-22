import java.util.Scanner;

public class Change{
	public static void main(String[] args){
        //Scanner definition
        Scanner input = new Scanner(System.in);

        // Asks the user to provite an amount of money then press enter
        System.out.println("Please enter a money amount: (ex: 56.78)");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount*100);

        //Calculate the amount of 10 dollar bills
        int tenDollarBill;
        tenDollarBill = remainingAmount / 1000;
        remainingAmount = remainingAmount - (tenDollarBill*1000);

        //Calculate the amount of 5 dollar bills
        int fiveDollarBill;
        fiveDollarBill = remainingAmount / 500;
        remainingAmount = remainingAmount - (fiveDollarBill*500);

        //Calculate the amount of 1 dollar bills
        int oneDollarBill;
        oneDollarBill = remainingAmount / 100 ;
        remainingAmount = remainingAmount - (oneDollarBill*100);

        //Calculate the amount of 25 cents coins
        int quarterCoin;
        quarterCoin = remainingAmount / 25;
        remainingAmount = remainingAmount - quarterCoin*25;

        //Calculate the amount of 10 cents coins
        int dimeCoin;
        dimeCoin = remainingAmount / 10;
        remainingAmount = remainingAmount - dimeCoin*10;

        //Calculate the amount of 5 cents coins
        int nickelCoin;
        nickelCoin = remainingAmount / 5;
        remainingAmount = remainingAmount - nickelCoin*5;

        //Calculate the amount of 1 cent coins
        int pennyCoin;
        pennyCoin = remainingAmount;
        remainingAmount = remainingAmount - pennyCoin;

        //Calculate the amount of 1 cent coins
        System.out.println(tenDollarBill + " ten dollar bills");
        System.out.println(fiveDollarBill + " five dollar bills");
        System.out.println(oneDollarBill + " one dollar bills");
        System.out.println(quarterCoin + " quarters");
        System.out.println(dimeCoin + " dimes");
        System.out.println(nickelCoin + " nickels");
        System.out.println(pennyCoin + " pennies");

        //Scanner closing
        input.close();
	}
}