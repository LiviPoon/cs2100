public class Quiz2 {
    
    public static void main(String [] args){
        Cup cup1;
    // create a Cup reference variable named cup1
        cup1 = new Cup(12);
    // create a Cup object with starting value of 12
    // and store the reference to the object in cup1
        
    // change the number of ounces in cup1 to 8

        cup1.setOunces(8);

    // print the new value stored in cup1’s ounces variable

        int currentOunces = cup1.getOunces();

        System.out.print(currentOunces);

    }
}