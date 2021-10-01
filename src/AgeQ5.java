import java.util.Scanner;
    public class AgeQ5 {
        public static void main(String[] args) {
            Scanner keyboard=new Scanner(System.in);
            System.out.println("Enter the year you were born");
            int yearOfBorn;
            yearOfBorn= keyboard.nextInt();
            int currentYear=0;
            int age;
            age= (currentYear-yearOfBorn);
            System.out.println("You were born in "+yearOfBorn+ " and will be "+age+ " this year");
        }
    }


