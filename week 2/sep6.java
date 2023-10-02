/*

Introduction to printf, chartAt, if statements.

*/


public class Demo{
    public static void main(STring [] args){
        String s = "hello world";
        char ch = s.charAt(0);


        s = s.toUpperCase(); // must save changed variable to a variable for it to show up.
        System.out.println(); //takes in one value
        System.out.printf("test %.2f", ch); // placeholder is %.2f, place holder is replaced with ch.
        // %f - floating point, %d - integer, the .2 before %.2f rounds the number into the first two digets after the decimal point.


        int x = 4;
        int y = 5;

        if(x>y) {
            System.out.println("bigger");
            System.out.println("done");
        }

        else {
            System.out.println("not bigger");
        }

        /*
            note usage of logical operators (In order of precedence (high to low))

            ! - not
            && - and
            || - or
            
        */

        if ((x<3) && (y>4)){
            System.out.println("here");
        }

        /*
            Assume num1, num2 and num3 are declared as ints and have been initialized. Write a conditional statement that
            displays one of the following three messages “going up”, “going down”, or “not up or down” based on the relative
            ordering of num1, num2, num3.
        */

        if ((num1 < num2) && (num2<num3)){
            System.out.println("Going Up");
        }

        else if ((num1 > num2) && (num2 > num3)){
            System.out.println("Going Down");
        }

        else {
            System.out.println("Not Up or Down");
        }

        /*

        Complete the exercise once using an if, else if, else and logical operators and once using nested if statements and no
        logical operators.

        */


        if (num1<num2)
            if (num2<num3)
                System.out.println("Going Up");

    }
}