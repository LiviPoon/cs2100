import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javaFiles.Tweet;

public class TwitterDriver {
    public static void main (String[] args) throws IOException  {

        //load the input file
        TwitterFeed twitterFeed = loadTwitterFeedFromFile("feed1.txt");

        // Demonstrate toString()
        System.out.println("Feed of @" + twitterFeed.getSName());
            ArrayList<Tweet> allTweets = twitterFeed.getCollectionTweets();
            for (Tweet tweet : allTweets) {
                System.out.println("@" + tweet.getName());
                System.out.println("\"" + tweet.getContent() + "\"");
            }

        // Demonstrate tweetsBy method
        String screenNameToSearch = "BillGates";
        ArrayList<Tweet> tweetsByScreenName = twitterFeed.tweetsBy(screenNameToSearch);

        System.out.println("\nTweets on " + twitterFeed.getSName() + " feed by " + screenNameToSearch + ":");
        for (Tweet tweet : tweetsByScreenName) {
            System.out.println(tweet.toString());
        }
    }

    //method for loading twitterfeed from a file.
    private static TwitterFeed loadTwitterFeedFromFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        Scanner file = new Scanner(fileReader);

        // Read the owner's screen name from the first line

        TwitterFeed twitterFeed = new TwitterFeed(file.nextLine());
        
        // For every two lines after that save them to the twitterFeed arrayList.
        while (file.hasNext()) {
            String name = file.nextLine();
            String content = file.nextLine();

            Tweet tmp = new Tweet(name, content);

            twitterFeed.addTweet(tmp);
        }
        
        file.close();
        return twitterFeed;
    }

}
