import java.util.*;
public class searchTwoDArr {
    public static int[][] inputArr(int rows, int cols, Scanner sc){
        int arr[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter element at position : (" + i + "," + j + ")" + " ");
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    public static boolean searchArr(int arr[][], int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    System.out.println("Target found at index : (" + i + "," + j + ") ");
                    return true;
                }
            }
        }

        System.out.println("Element not found!!");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows you want to enter : ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns you want to enter : ");
        int cols = sc.nextInt();

        int twoDArr[][] = inputArr(rows, cols, sc);

        System.out.println("Enter element to search : ");
        int target = sc.nextInt();

        searchArr(twoDArr, target);

        sc.close();
    }
}
