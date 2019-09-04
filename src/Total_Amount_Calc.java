public class Total_Amount_Calc {

  public static double Total_Amount(int Quantity, double Rate, double GST_Slab) {
    double Total_Rate=(Quantity*Rate);
    double Total_GST=(Total_Rate*GST_Slab);
    double Total_Amount=(Total_Rate+Total_GST);
    return Total_Amount;
  }
}
