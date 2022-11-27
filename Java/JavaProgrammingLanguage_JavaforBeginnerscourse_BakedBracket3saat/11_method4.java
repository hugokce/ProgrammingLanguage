public class method4 {
    public static void main(String[] args) {
        
        double myBudget_dollars=250;
        double myBudget_euros = dollarToEuro(myBudget_dollars);
    System.out.println(myBudget_euros);
    }
public static double dollarToEuro(double dollar){
double euro = dollar*0.90;
return euro;

}

}
