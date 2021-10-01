import java.util.Scanner;
public class TemperatureQ3 {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Enter temperature in degree celsius");
        double tempCelsius, tempFahr;
        tempCelsius= keyboard.nextDouble();
        tempFahr=1.8*tempCelsius+32;
        System.out.println("The temperature in degree fahrenheit is "+tempFahr);
    }
}


