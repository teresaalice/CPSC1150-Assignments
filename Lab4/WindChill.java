import java.util.Scanner;

public class WindChill {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println ("Wind Chill Index Calculator");
        System.out.println();
        //Prompts user for two numeric values, first being between the range of -50 to 50
        //the second one between the range of 0 to 100
        System.out.print("Please enter a temperature (-50 to 50) in degrees Celsius: " );
        double temperatureInput = scan.nextDouble();
        System.out.print("Please enter the wind speed (0 to 100) in km/h: " );
        double windSpeedInput = scan.nextDouble();

        double temperatureWindChill;

        // In case the numeric values are out of the asked range, displays an error message,
        //otherwise displays it for the user the value as int to avoid unecessary decimal numbers
        if((temperatureInput > 50)||(temperatureInput < -50)){
            System.out.print("Temperature input not within the -50 to 50 range! Please try again." );
        } else if ((windSpeedInput > 100)||(windSpeedInput < 0)){
            System.out.print("Temperature input not within the 0 to 100 range! Please try again." );
        }else{
            temperatureWindChill = 13.112 + 0.6215 * temperatureInput - 11.37 * (Math.pow(windSpeedInput, 0.16)) + 0.3965 * temperatureInput * (Math.pow(windSpeedInput, 0.16));
            System.out.print("The wind chill index is " + (int)temperatureWindChill + " °C." );
        }
        scan.close();
    }
}