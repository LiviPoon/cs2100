 import java.util.Random;
 
 public class RandomStuff  
 {
    public static void main(String [] args)
    {
       Random rand = new Random();
       
       int n;
       n = rand.nextInt(6); // 0 .. 5
       int die;
       die = rand.nextInt(6) + 1;  // 1 .. 6
       // for numbers between low and high (inclusive)
       // num = rand.nextInt(high - low + 1) + low;
       while (die != 6)
       {  
          System.out.println(die);
          die = rand.nextInt(6) + 1; 
      }
       double d;
       d = rand.nextDouble();
       
       
       
 
    }
   
 }
