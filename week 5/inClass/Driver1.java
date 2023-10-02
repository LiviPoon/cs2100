public class Driver
{

   public static void main(String [] args)
   {
      Fraction f1;  //reference variable
      f1 = new Fraction(1,2);
      
      Fraction f2 = new Fraction(2,3);
      
      Fraction result = add(f1,f2);
      
      doubleIt(result);
      
      
      System.out.println(result.getNumerator() + "/" +
                         result.getDenominator());
      System.out.println(result.getDecimal());
   
   }
   public static void doubleIt(Fraction f)
   {
      f.setNumerator( f.getNumerator() * 2  );
   
   }
   
   
   public static Fraction add(Fraction f1, Fraction f2)
   {
      int n1,n2,d1,d2;
      n1 = f1.getNumerator();
      n2 = f2.getNumerator();
      d1 = f1.getDenominator();
      d2 = f2.getDenominator();
      
      int newN = n1 * d2 + n2 * d1;
      int newD = d1 * d2;
      
      Fraction result = new Fraction (newN, newD);
      return result;
      
   }

}