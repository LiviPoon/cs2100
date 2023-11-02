/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Vehicle class has owner, make, model, year, miliage, numPassengers, isSuv, drivername, and driverid. It is also the super class of Automobile.
*/

public class Taxi extends Automobile {
    private Person driver;
    private String id;

    /**
     * constructor Taxi takes in person, string, string, int, int, int, boolean, person, and string (person, make, model, year, miliage, numpassengers, isSuv, driver, driver id) 
     */

    public Taxi(Person p, String mk, String mo, int yr, int mi, int numPassengers, boolean isSuv, Person d, String id){
        super(p,mk, mo, yr, mi, numPassengers, isSuv);
        this.driver = d;
        this.id = id;
    }
    /**
     * method getDriver gets taxi driver and returns person object
     * @return returns driver in person
    */
    public Person getDriver(){
        return this.driver;
    }

    /**
     * method getID gets Id string and returns string
     * @return returns id in string format
    */
    public String getId(){
        return this.getId();
    }

    /**
     * method setDriver gets taxi driver and returns person object
     * @param d input person driver is the driver person
    */

    public void setDriver(Person d){
        this.driver = d;
    }

    
    /**
     * method setId gets taxi id string and sets string obj
     * @param d input person id to the id inputed
    */
    public void setId(String id){
        this.id = id;
    }


    /**
     * method tostring overrides default tostring method
     * @return returns string in format %s,%nDriver: %s ID%s (automobiletostring, driver, id)
     */
    @Override
    public String toString(){
        return String.format("%s,%nDriver: %s ID%s",super.toString(), this.driver, this.id);
    }
     /**
     * method equals overrides default equals method (==).
     * @return returns true false true if the objs are the same false if not.
     */
    @Override
    public boolean equals(Object taxi){
        Taxi tmpT = (Taxi)taxi;

        return super.equals(tmpT) && tmpT.driver == this.driver && tmpT.id.equals(this.id);
    }
    
}

