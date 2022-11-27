import java.util.Scanner;

public class HelloWorld{

    public static void main(String[] args) {
        int dragonsNmb=3;
        System.out.println("Hello World");
        System.out.println("There once was a knight named John. John killed " + dragonsNmb + 
        " dragons" + " a reward for killing " + dragonsNmb + " dragons, he received " + 
        dragonsNmb + " gifts");
        int basket1=15;
        int basket2=30;
        int total=basket1+basket2;
        System.out.println(total);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int years = scanner.nextInt();


        System.out.println("Hi " + name + " You are "+ years + " years old");
    }


    
}