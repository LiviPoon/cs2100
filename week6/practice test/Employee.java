/*
 * Write a class named Employee that has the following fields:
• name. The name field references a String object that holds the employee’s name.
• idNumber. The idNumber is an int variable that holds the employee’s ID number.
• department. The department field references a String object that holds the name of
the department where the employee works.
• position. The position field references a String object that holds the employee’s
job title.


The class should have the following constructors:
• A constructor that accepts the following values as arguments and assigns them to the 
appropriate fields: employee’s name, employee’s ID number, department, and position.
• A constructor that accepts the following values as arguments and assigns them to the 
appropriate fields: employee’s name and ID number. The department and position
fields should be assigned an empty string ("").
• A no-arg constructor that assigns empty strings ("") to the name, department, and
position fields, and 0 to the idNumber field.


Write appropriate mutator methods that store values in these fields and accessor methods 
that return the values in these fields. Once you have written the class, write a separate pro- 
gram that creates three Employee objects to hold the following data:
 */

public class Employee {
    private String name;
    private String department;
    private int idNum;
    private String position;

    public Employee(String n, String d, int id, String p){
        this.name = n;
        this.department = d;
        this.idNum = id;
        this.position = p;
    }

    public Employee(String n, int id){
        this.name = n;
        this.idNum = id;
        this.department = "";
        this.position = "";
    }

    public Employee(){
        this.name = "";
        this.idNum = 0;
        this.department = "";
        this.position = "";
    }

    public void setName(String n){
        this.name = n;
    }

    public void setIdNum(int id){
        this.idNum = id;
    }

    public void setDepartment(String d){
        this.department = d;
    }

    public void setPosition(String p ){
        this.position = p;
    }

    public String getName(){
        return this.name;
    }

    public int getIdNum(){
        return this.idNum;
    }

    public String getDepartment(){
        return this.department;
    }

    public String getPosition(){
        return this.position;
    }







}
