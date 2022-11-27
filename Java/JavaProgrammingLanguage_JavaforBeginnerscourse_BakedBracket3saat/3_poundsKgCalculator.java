import java.util.Scanner;

public class poundsKgCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi Sabina ");
        System.out.println("how much do you weigh in kg? ");

        double kg = scanner.nextDouble();
        double lbs = kg * 2.20;
        System.out.println("you have " + lbs+ " lbs ");

    }
}
