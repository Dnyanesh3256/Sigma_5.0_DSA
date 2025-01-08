import java.util.*;
public class palindromeString {
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String to check if it is Palindrome : ");
        String str = sc.nextLine();

        if(isPalindrome(str)){
            System.out.println(str + " is palindrome String");
        }else{
            System.out.println(str + " is not palindrome String");
        }

        sc.close();
    }
}
