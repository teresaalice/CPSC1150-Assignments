import java.util.Scanner;

public class Shizzle {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        //Prompts user for a string
        System.out.print("Please enter a string:" );
        String userInput = scan.nextLine();

        //Detects a place where there's a non-space character followedby a space character
        // (or end of the string) using the regex ([^\s])(\s|$)/ then inserts izzle between them.

        String izzleString = userInput.replaceAll("([^\\s])(\\s|$)", "$1izzle$2");
        System.out.println(izzleString);

        scan.close();
    }
}