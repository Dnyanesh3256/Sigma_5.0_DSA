import java.util.*;
public class pairsArray {

    public static void inputArr(int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at index : " + i);
            arr[i] = sc.nextInt();
        }

        sc.close();
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printPairs(int arr[]){
        int tp = 0;
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            for(int j=(i+1);j<arr.length;j++){
                System.out.print("(" + current + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }

        System.out.println("Total Pairs = " + tp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Input elements in an Array : ");
        inputArr(arr);

        System.out.println("Inputed array is : ");
        printArray(arr);
        
        System.out.println("Pairs of the array is : ");
        printPairs(arr);

        sc.close();
    }
}
