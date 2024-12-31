import java.util.Scanner;

public class floydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int num  = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((j<=i)){
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
