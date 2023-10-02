/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Author Class which has first name, last name, and an email address.
*/


public class Author{

    //declare private variables
    private String firstName;
    private String lastName;
    private String emailAddy;

    /**
     * global constructor for all input variables
     * @param fN input first name as a string
     * @param lN input last name as a string
     * @param emailAd input email as a string
     */

    //global constructor
    public Author(String fN, String lN, String emailAd){
        this.firstName = fN;
        this.lastName = lN;
        this.emailAddy = emailAd;
    }

    /**
     * copy constructor
     * @param author input author obj
     */

    //copy constructor
    public Author(Author author){
        this.firstName = author.firstName;
        this.lastName = author.lastName;
        this.emailAddy = author.emailAddy;
    }

     /**
     * method toString returns string of obj
     * @return returns first name, last name, and email addy
     */

    @Override
    public String toString(){
        return String.format("%s %s <%s>", firstName, lastName, emailAddy);
    }

     /**
     * method equals overrides default equals to check if author obj are the same.
     * @param auth input author obj
     * @return returns boolean, true if obj are the same, false if obj are not.
     */

    @Override
    public boolean equals(Object auth){
        Author author = (Author)auth;
        return this.firstName.equals(author.firstName) &&
        this.lastName.equals(author.lastName) &&
        this.emailAddy.equals(author.emailAddy);
    }

     /**
     * method getFirstName grabs the firstname of the obj and returns it
     * @return returns firstname in string format
     */

    public String getFirstName(){
        return firstName;
    }

     /**
     * method getLastName grabs the last name of the obj and returns it
     * @return returns last name in string format
     */

    public String getLastName(){
        return lastName;
    }

     /**
     * method getEmailAddy grabs the email address of the obj and returns it
     * @return returns the email address
     */

    public String getEmailAddy(){
        return emailAddy;
    }

     /**
     * method setFirstName grabs input name and sets firstName to it.
     * @param n input name
     */

    public void setFirstName(String n){
        this.firstName = n;
    }

     /**
     * method setLasttName grabs input name and sets lastName to it.
     * @param n input name
     */
    public void setLastName(String n){
        this.lastName = n;
    }

    /**
     * method setEmailAddy grabs input name and sets emailAddy to it.
     * @param n input name
     */
    public void setEmailAddy(String ad){
        this.emailAddy = ad;
    }



    
}