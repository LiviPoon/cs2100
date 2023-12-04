public class Recursion {
    public static void main (String [] args){
        // System.out.println(modulus(14, 8));
        // writeNums(5);
        // System.out.println(addNums(5));
        //System.out.println(isAlpha("helloworld"));
        // System.out.println(recPower(5, 3));
        System.out.println(series(1));
    }

    public static int func (int n){
        if (n<5)
            return n;

        return n+func(n-1);
    }

    public static int modulus(int x, int y){
        if (x < y)
            return x;
        return modulus(x-y, y);
    }

    public static void writeNums(int n){
        if (n>=1){
            System.out.print(n +",");
            writeNums(n-1);
        }
    } 
    
    public static int addNums(int n){
        if (n==0)
            return 0;
        return n+addNums(n-1);
    }

    /*
     * s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i) >= 'A' && s.charAt(i) <='Z'
     * Character.isAlphabetic(s.chartAt(i))
     */
    public static boolean isAlpha(String s){
        if (s.length() == 0)
            return true;
            
        else if (Character.isAlphabetic(s.charAt(0))){
            return isAlpha(s.substring(1));
        }

        else 
            return false;
    }

    public static int recPower(int n, int p){
        if (p==0){
            return 1;
        }
        return n * recPower(n, p-1);
    }

    public static double series(int i){

        if (i==1){
            return 1/3.0;
        }

        return (double)(i/(2*i+1) + series(i-1));
    }

    // public static double series(int i){

        



    
}
