import java.lang.Math; 
public class PhoneNumber {
    public static void main (String[] args){

        System.out.println();
        System.out.println ("Phone Number Generator");
        System.out.println();

        //Only the first 3 numbers will be calculated separately, considering their restrictions
        //Generates the first number, which must be between 1 and 7
        //then adds it to the string
        String phoneNumber = Integer.toString((int)(Math.random() * ((7 - 1) + 1))+1);

        // Generates the second number, which must be between 0 and 7
        // then adds it to the string
        phoneNumber = phoneNumber + Integer.toString((int)(Math.random() * ((7 - 0) + 1)));

        // Generates the third number, which must be between 0 and 7
        // then adds it to the string
        phoneNumber = phoneNumber + Integer.toString((int)(Math.random() * ((7 - 0) + 1)));

        //adds the "-" and the new two sets of numbers to the string
        //the first one being the number not greater than 655 and the second one any number between 1000 and 9999
        phoneNumber = phoneNumber + "-" + Integer.toString((int)(Math.random() * ((655 - 100) + 1))+100);
        phoneNumber = phoneNumber + "-" + Integer.toString((int)(Math.random() * ((9999 - 1000) + 1))+100);

        //Prompts the phone number to the user.
        System.out.println("Your phone number is: " + phoneNumber);
    }
}