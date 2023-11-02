/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Truck Class has truck which has capacity and num axels and extends vehicle class.
*/

public class Truck extends Vehicle {
    
    private int capacity;
    private int numAxles;

    private static final int DEF_CAPACITY = 1;
    private static final int DEF_AXLES = 2;

    /**
     * Constructor Truck (Person, String, String, int, int, int, int)
     * @param p person obj input
     * @param mk make
     * @param mo model
     * @param yr year
     * @param mi miliage
     * @param cap capacity
     * @param numA number of axels
     */

    public Truck(Person p, String mk, String mo, int yr, int mi, int cap, int numA){
        super(p,mk, mo, yr, mi);
        this.capacity = cap;
        this.numAxles = numA;
    }

    /**
     * Constructor Truck(String, String, String, String, String, int, int)
     * @param name name
     * @param address address
     * @param phone phone
     * @param mk make
     * @param mo model 
     * @param yr year
     * @param mi miliage
     */
    public Truck(String name, String address, String phone, String mk, String mo, int yr, int mi){
        super(new Person(name, address, phone),mk, mo, yr, mi);
        // Person tmpPerson = new Person(name, address, phone);
        // setOwner(tmpPerson);
        // setMake(mk);
        // setModel(mo);
        // setYear(yr);
        this.capacity = DEF_CAPACITY;
        this.numAxles = DEF_AXLES;
    }

    /**
     * method getCapacity gets the capacity
     * @return returns capacity in int form
     */
    public int getCapacity(){
        return this.capacity;
    }

     /** 
     * method getAxles gets the axels from obj
     * @return returns axles in int form
     */
    public int getAxles(){
        return this.numAxles;
    }

     /**
     * method setCapacity sets capacity of obj
     * @param c input capacity in int form.
     */
    public void setCapacity(int c){
        this.capacity = c;
    }

    /**
     * method setAxles sets axels of obj
     * @param a input axles in int form.
     */
    public void setAxles(int a){
        this.numAxles = a;
    }

    /**
     * method toString overrides to string method.
     * @return returns string in format (string\nstring string int int miles int ton int axles)
     */
    @Override
    public String toString(){
        Person o = getOwner();
        String mk = getMake();
        String mo = getModel();
        int mi = getMiliage();
        int yr = getYear();
        return String.format("%s%n%s %s %d %d miles %d ton %d axles", o, mk, mo,yr, mi, this.capacity, this.numAxles);
    }


    /**
     * method equals overrides default equals method (==).
     * @return returns true false true if the objs are the same false if not.
     */
    @Override
    public boolean equals(Object t){
        Truck tmpT = (Truck)t;

        return super.equals(tmpT) && tmpT.numAxles == this.numAxles && tmpT.capacity ==this.capacity;
    }
    
}
