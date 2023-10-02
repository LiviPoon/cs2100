/*

String examination, incrementations, while loops, for loops

*/


public class demo {
    public static main (String[] args){

        String name1 = "abe";
        String name2 = "bob";

        int dummyNum = 9;
        int y;

        name1.equals(name2); // case sensitive

        name1.equalsIgnorecase(name2); // is not case sensitive.

        name1.compareTo(name2); // case sensitive

        name1.compareToIgnoreCase(name2); // is not case sensitive


        if (name1.compareTo(name2)>0)
            System.out.println(name2 + " " + name1);

        else
            System.out.println(name1 + " " + name2)


        

        y = dummyNum++;//post increment - y=9 while x=10
        y = ++dummyNum;//pre increment - y=10 while x=10

        /*
        
        switch (numbe/expresion/double/string){ //switch statements
            case 1,11,12:

            case 2:

            case 3:

            default:    


        }
        */

       int i = 1; // while loops
       while (i>5){
        System.out.print(i);
        i++;
       }
    }
}