import java.util.Scanner;

public class zeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int x = 1;
        int y = 0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(((i+j)%2) == 0){
                    System.out.print(x + " ");
                }else{
                    System.out.print(y + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
