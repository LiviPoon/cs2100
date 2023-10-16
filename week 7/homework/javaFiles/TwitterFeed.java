import java.util.ArrayList;

import javaFiles.Tweet;

public class TwitterFeed {
    // private variables
    private String sName;
    private ArrayList<Tweet> collectionTweets;

    //class specific variables
    private static final int INITIAL_CAPACITY = 100;

    /**
     * constructor of the twitterfeed class.
     * @param n input string for the user who made the feed.
     */
    public TwitterFeed(String n){
        this.sName = n;
        this.collectionTweets = new ArrayList<Tweet>(INITIAL_CAPACITY);
    }

    /**
     * toString method overrides default toString
     * @return returns the a stringafied version of the twitterfeed object.
     */

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("Owner: " + sName + "\nTweets:\n");
        for(Tweet tweet : collectionTweets){
            result.append((tweet.toString())).append("\n");
        }
        return result.toString();
    }

    /**
     * Get method getSname returns the twitterfeed name
     * @return returns twitterfeed name from obj
     */
    public String getSName() {
        return this.sName;
    }

    /**
     * setSName sets the name of the twitterfeed obj
     * @param sName input name for the twitterfeed to be set to.
     */
    public void setSName(String sName) {
        this.sName = sName;
    }


    /**
     * the method getCollectionTweets takes this.collectionTweets and makes a deep copy which is then returned
     * @return deep copy of object's collectionTweets arrayList
     */

    public ArrayList<Tweet> getCollectionTweets() {
        ArrayList<Tweet> copy = new ArrayList<Tweet>(INITIAL_CAPACITY); 

        for (int i = 0; i < collectionTweets.size(); i++) {
            copy.add(collectionTweets.get(i));
          }

        return copy;
    }

    /**
     * Overloaded addTweet (string, string) method: this particular one takes both the name and content of the tweet, creates it, then saves it.
     * @param s name of the owner of the tweet
     * @param c content of the tweet
     */
    public void addTweet(String s, String c){
        Tweet tmpTweet = new Tweet(s, c);
        this.collectionTweets.add(tmpTweet);
    }

    /**
     * Overloaded addTweet (Tweet) method: this particular one takes an entire tweet and saves it.
     * @param c
     */
    public void addTweet(Tweet c){
        this.collectionTweets.add(c);
    }

    /**
     * Method tweetsBy (String) searches collectionTweets arrayList and returns an arrayList of the tweets from the inputted name
     * @param s input name
     * @return returns an ArrayList which is a list of tweets from the inputed name.
     */
    public ArrayList<Tweet> tweetsBy(String s){
        ArrayList<Tweet> tmpArray = new ArrayList<Tweet>(INITIAL_CAPACITY);

        for (int i = 0; i < collectionTweets.size(); i++){
            Tweet tmpTweet = this.collectionTweets.get(i);

            if (tmpTweet.getName().equals(s)){
                tmpArray.add(tmpTweet);
            }
        }

        return tmpArray;
    }

}
