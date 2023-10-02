public class Fraction
{
   // instance variables
   private int numerator;
   private int denominator;
   
   // constructors
   // default constructor
   public Fraction()
   {
      numerator = 0;
      denominator = 1;
      
   }
   // alternate constructor
   public Fraction (int numerator)
   {
      this.numerator = numerator;
      denominator = 1;
   }
   
   public Fraction(int n, int d)
   {
      numerator = n;
      //denominator = d ;
      setDenominator(d);
   
   }
   
   
   public int getNumerator()
   {
      return numerator;
   }
   public void setNumerator(int num)
   {
      numerator = num;
      //reduce();
   }  
   public int getDenominator()
   {
      return denominator;
   }
   public void setDenominator(int den)
   {
      if (den == 0)
         den = 1;
      denominator = den;
      reduce();
   }   
   public double getDecimal()
   {
      return (double)numerator/denominator;
   } 
   //utility method
   private void reduce()
   {
      // denominator can't be negative
      if (denominator < 0)
      {
         numerator *= -1;
         denominator *= -1;
      }
      
      // reduce to lowest terms
      int lower = Math.min( Math.abs(numerator), 
                  Math.abs(denominator) );
      while (numerator % lower != 0 || 
                        denominator % lower != 0)
      {
         lower--;
      }
      
      numerator /= lower;
      denominator /= lower;
      
   }
    
}