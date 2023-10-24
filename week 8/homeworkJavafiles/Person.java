
public class Person {

    //declare private variables
    private String name;
    private String address;
    private String phone;

    //constructor for person
    /**
     * Constructor for person, takes in name, address, and phone number.
     * @param n input name as String
     * @param a input address as String
     * @param p input phone as String
     */
    public Person(String n, String a, String p){
        this.name = n;
        this.address = a;
        this.phone = p;
    }

    /**
     * method getName returns obj name as String
     * @return returns obj name as String
     */
    public String getName(){
        return this.name;
    }

    /**
     * method getAddress returns obj address as String
     * @return returns obj address as String
     */
    public String getAddress(){
        return this.address;
    }

    /**
     * method getPhone returns phone name as String
     * @return returns obj phone as String
     */
    public String getPhone(){
        return this.phone;
    }

    /**
     * method setName sets name with given name as String 
     * @param n input name
     */
    public void setName(String n){
        this.name = n;
    }

    /**
     * method setAddress sets address with given address as String 
     * @param a input address
     */
    public void setAddress(String a){
        this.address = a;
    }

    /**
     * method setPhone sets phone with given phone number as a String
     * @param p input phone number as a String
     */
    public void setPhone(String p){
        this.phone = p;
    }

    /**
     * override method toString overrides default toString method
     * @return returns to string format in name, address, phone format.
     */
    @Override
    public String toString(){
        return String.format("%s, %s, %s", name, address, phone);
    }

    /**
     * override equals method overrides default equals method
     * @return true or false value, true being that all of the input obj values are equals, false are that they are not the same.
     */
    @Override
    public boolean equals(Object p){
        Person inPerson = (Person)p;
        return inPerson.name.equals(this.name) && inPerson.address.equals(this.address) && inPerson.phone.equals(this.phone);
    }
}

