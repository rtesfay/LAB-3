import java.util.Scanner;
 public class ConversionQ2 {
        public static void main(String[] args) {
            Scanner keyboard=new Scanner(System.in);
            System.out.println("Enter a whole number in inches and in feet one by one");
            int number= keyboard.nextInt();
            System.out.println("Inches: "+number*2.54);
            System.out.println("Feet: "+number*30.48);
        }
    }


