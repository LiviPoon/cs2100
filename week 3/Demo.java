
public class Demo{

    public static void main(String[] args){
        stringMiddle("ouch");
    }

    public static void stringMiddle(String input){
        int strLength = input.length();

        if (strLength%2 == 1){
            System.out.print(input.charAt(strLength/2));
        }

        else{
            System.out.print(input.charAt((strLength/2)-1));
            System.out.print(input.charAt(strLength/2));
        }
    }

    public static int smallInt(int num1, int num2, int num3){
        if (num1<=num2 && num1<=num2){
            return num1;
            
        }

        else if (num2<=num1 && num2<=num3){
            return num2;
        }

        else{
            return num3;
        }
    }

}