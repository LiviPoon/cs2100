/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Automobile class has owner, make, model, year, miliage, numper of passengers, and is suv. It is also the super class of vehicle.
*/


public class Automobile extends Vehicle{
    private int numPassengers;
    private boolean isSuv;

     /**
     * constructor automobile takes in person, string, string, int, int, int, and boolean (person, make, model, year, miliage, numpassengers, isSuv) 
     */

    public Automobile(Person p, String mk, String mo, int yr, int mi, int numPassengers, boolean isSuv){
        super(p,mk, mo, yr, mi);
        this.numPassengers = numPassengers;
        this.isSuv = isSuv;
    }

     /**
     * method getNumPassengers grabs the numPassangers var of the obj and returns it
     * @return returns int
     */
    public int getNumPassengers(){
        return numPassengers;
    }

     /**
     * method getIsSuv grabs the IsSuv var of the obj and returns it
     * @return returns boolean
     */

    public boolean getIsSuv(){
        return isSuv;
    }

     /**
     * method setNumPassengers grabs input number and sets numPassengers to it.
     * @param n input number of passengers
     */

    public void setNumPassengers(int n){
        this.numPassengers = n;
    }

     /**
     * method setIsSuv grabs input name and sets isSuv to it.
     * @param n input boolean
     */
    public void setIsSuv(boolean n){
        this.isSuv = n;
    }

    /**
     * method toString overrides to string method.
     * @return returns string in format 
     */
    @Override
    public String toString(){
        String tmpSuv = "";

        if (isSuv == true){
            tmpSuv = "SUV";
        }

        else{
           tmpSuv = "";
        }

        return String.format("%s %d passengers %s", super.toString(), this.numPassengers, tmpSuv);
    }

    /**
     * method equals overrides default equals method (==).
     * @return returns true false true if the objs are the same false if not.
     */
    @Override
    public boolean equals(Object a){
        Automobile tmpA = (Automobile)a;

        return super.equals(tmpA) && tmpA.numPassengers == this.numPassengers && tmpA.isSuv ==this.isSuv;
    }
}
