package javaFiles;
public class Tweet {

    //declaring private variables
    private String name;
    private String content;

    //declaring class variables
    private static final int MAX_CHARS = 140;

    //constructors

    /**
     * Constructor tweet(string, string) creates a tweet with input name and content
     * @param n input name
     * @param c input tweet content
     */
    public Tweet(String n, String c){
        this.name = n;

        if (c.length()>MAX_CHARS){
            this.content = c.substring(0, MAX_CHARS);
        }

        this.content = c;
    }

    /**
     * Copy constructor
     * @param t takes in input tweet obj to make a copy of.
     */
    public Tweet(Tweet t){
        this.name = t.name;
        this.content = t.content;
    }

    /**
     * overrode method toString returns formated string of the tweet.
     * @return returns stringafied object information in specific formating.
     */
    @Override
    public String toString(){
        return String.format("@%s%n\"%s\"", this.name, this.content);
    }

    /**
     * overrode method equals returns boolean based on whether or not current tweet equals the input tweet.
     * @return returns boolean, true if both object's information are the same, false if not.
     */
    @Override
    public boolean equals(Object t){
        Tweet tweet = (Tweet)t;

        return this.name.equals(tweet.name) && this.content.equals(tweet.content);
    }

    /**
     * getName method returns the obj's name
     * @return returns name in String format
     */
    public String getName(){
        return this.name;
    }

    /**
     * getContent method returns the obj's content
     * @return returns content in String form
     */
    public String getContent(){
        return this.content;
    }

    /**
     * setName method sets obj name to input name
     * @param n input name
     */
    public void setName(String n){
        this.name = n;
    }

    /**
     * setContent method sets tweet content to input content
     * @param c input content in String format
     */
    public void setContent(String c){
        this.content = c;
    }



}
