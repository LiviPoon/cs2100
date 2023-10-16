import java.lang.Math;

public class something {
    public static void main(String[] args){

        boolean lightTurnedOn;
        char typeOfBool;

        /**
         * class constants:
         *  private static final int SECOND_HOURS - static means it belongs to the class no the object.
         * 
         * 
         * Double
         * Float
         * Int
         * 
         * String
         * Char
         * 
         * && and
         * || or
         * 
         * 7 * 8 /9 == 6 && 4 < 5
         * 
         * 6.0 / 3 = float 2.0
         * int 3.0/2 = int 1 
         * 
         * Math.pi()
         * Math.pow(power, var1, var2)
         */
        int i = 0;

        for(int a = 0; a<10; a++){
            System.out.print(a);
        }

        while(i<10){
            i++;
            System.out.print(i);
        }

        do{
            i++;
            System.out.print(i);
        } while(i<9);


        String test = "Test1  ";
        String test2 = "Test1  ";
        String test3 = "asldkfjalsdf   ";

        test.equals(test2);
        test3.stripTrailing();

        if (test.equals(test2)){
            System.out.print("I'm ALIVE");
        }

        if (test.equals(test2)){
            if (test.equals(test3)){
                System.out.print("adslfasdf");
            }
        }

        else{
            System.out.print("SDLKFJSDLKF");x
        }




    }
}
