public class method3 {
    public static void main(String[] args) {
        inchtoCm(25);
        reserveSeat("Peter", 35);
// parametreden atalım dersek
String myName ="Peter";
int myReservation=32;

reserveSeat(myName, myReservation);
    }

    public static void inchtoCm( double inch) {
        double cm = inch*2.54;
        System.out.println(inch+" inch= "+cm+ " cm");
    }

    public static void reserveSeat(String name,int seatNr){
System.out.println("You reserved "+ seatNr + " on the name "+ name);

    }


}
