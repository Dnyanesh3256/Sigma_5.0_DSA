import java.util.*;
public class concatenateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name : ");
        String fname = sc.next();
        
        System.out.println("Enter your last name : ");
        String lname = sc.next();

        String fullName = fname + " " + lname;
        System.out.println(fullName);

        sc.close();
    }
}
