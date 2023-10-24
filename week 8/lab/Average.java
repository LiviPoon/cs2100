import java.util.Scanner;

public class Average {
    
    private int[] data;
    private double mean;

    private static final int NUM_SCORES = 5;

    public Average(){
        data = new int [NUM_SCORES];
    }

    public void getUserData(){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i<NUM_SCORES; i++){
            System.out.print("Enter Score Number" + (i+1) + " ");
            data[i] = input.nextInt();
        }
    }

    public void calculateMean(){
        int total = 0;
         for(int i = 0; i < data.length; i++){
            total += data[i];
        }

        mean = total/NUM_SCORES;
    }

    @Override
    public String toString(){
        String output = "";

        for(int i = 0; i<NUM_SCORES; i++){
           output += data[i] + " ";
        }

        return String.format("Data: [ %s] Mean: %f", output, mean);
    }
}
