/*
You are given a number (Eg.- 2019), convert it into a string of english like "two zero one nine".
Use a recursive function to solve this problem.
*/

public class Q2 {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printDigits(int num){
        if(num == 0){
            return;
        }

        int lastDigit = num%10;

        printDigits(num/10);

        System.out.print(digits[lastDigit] + " ");
    }
    public static void main(String[] args) {
        printDigits(2025);
    }
}
