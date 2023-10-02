public class Driver
{

   public static void main(String [] args)
   {
      Fraction f1;  //reference variable
      f1 = new Fraction();
      //System.out.println(f1);
      
      Fraction f2 = new Fraction();
      //System.out.println(f2);
      
      f1.setNumerator(-3);
      f1.setDenominator(-6);
      
      System.out.println(f1.getNumerator() + "/" +
                         f1.getDenominator());
      System.out.println(f1.getDecimal());

      Fraction f3 = new Fraction(9);

      System.out.println(f3.getNumeratorf());
   
   }

   public static Fraction add(Fraction f1, Fraction f2){
      int n1, n2, d1, d2;

      n1 = f1.getNumerator();
      n2 = f2.getNumerator();
      d1 = f1.getDenominator();
      d2 = f2.getDenominator();

      n1 = n1*d2;
      n2 = n2*d1;

      d3 = d1*d2;

      n3 = n1+n2;

      Fraction output = new Fraction(n3, d3);

      return output;

   }

}