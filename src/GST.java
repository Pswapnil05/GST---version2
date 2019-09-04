public class GST {

  public static void main(String[] args) {
    System.out.println("Welcome to GST Calculator");
    double Total= Total_Amount_Calc.Total_Amount(1,100,0.0);
    double Total1= Total_Amount_Calc.Total_Amount(2,250,0.05);
    System.out.println("Total Amount for 1Kg quantity of Rice = "+Total);
    System.out.println("Total Amount for 2 quantity of Chair = "+Total1);
  }

}
