import javax.xml.transform.Source;

public class ifstatement {
    public static void main(String[] args) {
        
boolean sheIsHappy = true;
if(sheIsHappy ){
System.out.println("She dances and sings in the apartment");
}

int myweight = 80;
if(myweight>90){
    System.out.println("I'm out of the shape I need to lift");
}

int testPassScore=50;
int myScore=60;
boolean inTime =true;  //false olursa else çalışır
if(myScore>testPassScore && inTime){
System.out.println("Congratulations you passed the test");
}
else {
System.out.println("I am sorry you failed");
}


int myScore2=50;
if (myScore2>80){
    System.out.println("you received grade A");
}

else if(myScore2>70) {
System.out.println("you received grade B");
}

else if(myScore2>60) {
    System.out.println("you received grade C");
    }

    else  {
        System.out.println("you received grade D E or F");
        }    

        int feetSize = 15;
        boolean isOver50=true;
      //  String name="John";
        if (isOver50 && feetSize >16 ){
        }

boolean movieonTv =true;
boolean watchedIt = false;
double reviewRating = 8.7; 

if(movieonTv){
    if(!watchedIt){
        if(reviewRating>5){
System.out.println("There is a good movie tonight i didnt watch movie night begins");
        }
    else{
        System.out.println("There is a movie tonight i didnot watch it it is prob not good");
    }
    }
else{
    System.out.println("There is a movie on TV tonight but I already watched it");
}
}
else{
    System.out.println("There is no movie on TV tonight");
}

}
}