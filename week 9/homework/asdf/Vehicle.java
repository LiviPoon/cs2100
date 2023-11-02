/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Vehicle class has owner, make, model, year, and miliage. It is also the super class of truck.
*/

public class Vehicle {
    //declare all private variables
    private Person owner;
    private String make;
    private String model;
    private int year;
    private int miliage;

    /**
     * constructor takes in Person, String, String, int, int
     * @param p input person obj : Person
     * @param mk input make : String
     * @param mo input model : String
     * @param yr input year : int
     * @param mi input miliage : int
     */
    public Vehicle(Person p, String mk, String mo, int yr, int mi){
        this.owner = p;
        this.make = mk;
        this.model = mo;
        this.year = yr;
        this.miliage = mi;
    }

    /**
     * constructor takes in Person, String, String, int
     * @param p input Person : Person
     * @param mk input make : String
     * @param mo input model : String
     * @param yr input yr : int
     */
    public Vehicle(Person p, String mk, String mo, int yr){
        this.owner = p;
        this.make = mk;
        this.model = mo;
        this.year = yr;
        this.miliage = 0;
    }

    /**
     * method getOwner returns owner string
     * @return returns obj owner string 
     */
    public Person getOwner(){
        return this.owner;
    }

    /**
     * method getMake returns make
     * @return returns obj make in string format
     */
    public String getMake(){
        return this.make;
    }

    /**
     * method getModel returns string
     * @return returns obj model in string format
     */
    public String getModel(){
        return this.model;
    }


    /**
     * method getYear returns year in int format
     * @return returns obj year in int format
     */
    public int getYear(){
        return this.year;
    }

    /**
     * method getMiliage returns miliage
     * @return returns obj miliage in int format
     */
    public int getMiliage(){
        return this.miliage;
    }

    /**
     * method getOwner sets owner
     * @return returns obj owner string 
     */
    public void setOwner(Person o){
        this.owner = o;
    }

    /**
     * method setMake sets model
     * @param mk input make in string format
     */
    public void setMake(String mk){
        this.make = mk;
    }

    /**
     * method setModel sets the model
     * @param mk input make in string format
     */
    public void setModel(String mo){
        this.model = mo;
    }


    /**
     * method setYear sets the obj's years
     * @param mk input make in string format
     */
    public void setYear(int yr){
        this.year = yr;
    }

    /**
     * method setMake
     * @param mk input make in string format
     */
    public void setMiliage(int mi){
        this.miliage = mi;
    }

    /**
     * override method toString returns the vehicle obj in formated string when called as a string
     * @return string in formated format
     */
    @Override
    public String toString(){
        return String.format("%s%n%s %d %d miles", this.owner, this.make, this.year, this.miliage);
    }


    /**
     * override method equals replaces default equals function
     * @return returns true if all of the stuff are equivlent or false if they are not equivilient.
     */
    @Override
    public boolean equals(Object v){
        Vehicle tmpV = (Vehicle)v;
        return tmpV.owner.equals(this.owner) && tmpV.make.equals(this.make) && tmpV.year == this.year && tmpV.miliage == this.miliage;
    }




}
