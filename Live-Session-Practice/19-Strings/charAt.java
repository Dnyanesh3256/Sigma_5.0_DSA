import java.util.*;
public class charAt {
    public static void printChars(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String : ");
        String str = sc.nextLine();

        printChars(str);

        sc.close();
    }
}
