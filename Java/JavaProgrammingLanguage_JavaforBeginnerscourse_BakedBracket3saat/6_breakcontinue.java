import java.util.Scanner;

public class breakcontinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
for(int i =3;i>0;i--){
System.out.println("What is his fav number");
int myGuess = scanner.nextInt();
if(myGuess==7){
    System.out.println("YES you got it");
break;
}
System.out.println("No it is not");
}


//continue
for (int i = 0; i < 3; i++) {
    System.out.println("You can pick 3 numbers that store in system number must greater than 10");
int myNumber=scanner.nextInt();
if(myNumber<9){
    continue;
}
System.out.println("You successfully stored"+ myNumber);
}
//3 defa çalıştı sayı girdik
    }
}
