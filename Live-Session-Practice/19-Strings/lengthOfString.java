import java.util.*;
public class lengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String : ");
        String str = sc.nextLine();

        System.out.println("Length of " + str + " is : " + str.length());

        sc.close();
    }    
}
