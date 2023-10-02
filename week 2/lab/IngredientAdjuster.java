
import java.util.Scanner; 


public class IngredientAdjuster {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        final double sugarRatio = 1.5;
        final double butterRatio = 1.0;
        final double flourRatio = 2.75;
        final double numBatch = 48;

        System.out.print("Enter the number of cookies: ");
        double numCookies = input.nextDouble();
        double sugarAmt = numCookies/numBatch * sugarRatio;
        double butterAmt = numCookies/numBatch * butterRatio;
        double flourAmt = numCookies/numBatch * flourRatio;

        System.out.printf("To make %f cookies, you will need: \n", numCookies);
        System.out.printf("%.1f cups of sugar\n", sugarAmt);
        System.out.printf("%.1f cups of butter\n", butterAmt);
        System.out.printf("%.1f cups of flour", flourAmt);


    }
}