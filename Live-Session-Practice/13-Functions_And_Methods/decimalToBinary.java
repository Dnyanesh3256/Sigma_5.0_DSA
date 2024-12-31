import java.util.*;
public class decimalToBinary {

    public static void deciToBin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int biNum = 0;

        while(decNum > 0){
            int rem = decNum % 2;
            biNum = biNum + (rem * (int)Math.pow(10, pow));

            pow++;
            decNum = decNum/2;
        }

        System.out.println("Binary form of " + myNum + " = " + biNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int decNum = sc.nextInt();

        deciToBin(decNum);

        sc.close();
    }
}
