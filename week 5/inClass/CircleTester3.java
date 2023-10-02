public class CircleTester
{
   public static void main(String [] args)
   {
      Circle c1 = new Circle(); 
      Circle c2 = new Circle(5,15);
      Circle c3 = new Circle(2,3,5);
      
      displayCircle(c1);
      c1.move();
      displayCircle(c1);
      c1.move(30,15);
      displayCircle(c1);

      displayCircle(c2);            

      displayCircle(c3);           
   
   
   }
   public static void displayCircle(Circle c)
   {
      System.out.printf("x : %d, y : %d, radius : %d\n", 
                        c.getX(), c.getY(), c.getRadius());
   }

}