import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
   //     int chew=0;
   //     while (chew<33){chew++}
int chewFood=0;
 while (chewFood<33){
    System.out.println("chewed "+chewFood+" time...");
    chewFood++;
 }


 //while loop
boolean caughtGoldenFish = true;
int wishes=3;
Scanner scanner = new Scanner(System.in);
System.out.println("What wish would you like me to grant");
while(caughtGoldenFish && wishes>0){
String wish = scanner.nextLine();
System.out.println(wish + " : granted ");
wishes--;
System.out.println("There are "+ wishes + " left");

}

//for loop
System.out.println("I am Superman");
for (int i =0;i<10;i++){
    System.out.println("I am superman");
}

//önce control variable oluşturulur
//sonra hangi koşul çalışmalı
// control variable değişmeli
// int i =0 control variable
// condition i<5 
//i++ iteration control variable nasıl değişir.

for(int i = 100;i>0;i--){
System.out.println(i);
}
System.out.println("Happy new year");

// do while loop
int unansweredEmails =0;  //3ten 0a çektik do için
do {
    System.out.println("checking and replying");
    System.out.println("There is "+unansweredEmails+" unanswered emails");
unansweredEmails--;
} while (unansweredEmails>0);

//ikinci örnek
//scanner tekrar tanımlamadık
int password;

do {
    System.out.println("Enter the password");
    password = scanner.nextInt();
} while (password!=1234);
System.out.println("you entered into the program...");
//password 1234 olana kadar şifre sorar 1234 girince biter.
}
}
