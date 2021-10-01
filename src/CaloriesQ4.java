import java.util.Scanner;
    public class CaloriesQ4 {
        public static void main(String[] args) {
            Scanner keyboard= new Scanner(System.in);
            System.out.println("Enter your weight");
            double weight;
            double caloriesPerDay;
            weight= keyboard.nextDouble();
            caloriesPerDay=19*weight;
            System.out.println("The number of calories a person needs per day is "+ caloriesPerDay);
        }
    }

