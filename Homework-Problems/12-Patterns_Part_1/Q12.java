/*
BUTTERFLY PATTERN
*/

import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i>=j){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }

            for(int m=1;m<=n;m++){
                if(m>=i){
                    System.out.print("");
                }else{
                    System.out.print("");
                }
            }

            for(int l=1;l<=n;l++){
                if(l+i < n+1){
                    System.out.print("");
                }else{
                    System.out.print("");
                }
            }

            for(int k=1;k<=n;k++){
                if(k+i >= n+1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }

            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int m=1;m<=n;m++){
                if(m+i <= n+1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }

            for(int m=1;m<=n;m++){
                if(m>=i){
                    System.out.print("");
                }else{
                    System.out.print("");
                }
            }

            for(int l=1;l<=n;l++){
                if(l+i < n+1){
                    System.out.print("");
                }else{
                    System.out.print("");
                }
            }

            for(int k=1;k<=n;k++){
                if(k>=i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
