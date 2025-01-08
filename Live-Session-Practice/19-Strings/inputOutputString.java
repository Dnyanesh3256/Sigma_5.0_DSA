import java.util.*;
public class inputOutputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = sc.next();
        System.out.println("Your name is : " + name);

        System.out.println("Enter your surname : ");
        String surname = sc.next();
        System.out.println("Your surname is : " + surname);

        System.out.println("Your full name is : " + name + " " + surname);

        sc.close();
    }
}
