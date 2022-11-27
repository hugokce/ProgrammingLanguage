import java.util.Scanner;

public class km2miles {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter km/h: ");
        double kmh = scanner.nextDouble();
        double resultMiles = kmh*0.62;
        System.out.println(kmh + " km/h "+ resultMiles + " mp/h");
    }
}
