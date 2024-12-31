import java.util.*;
public class printSubarray {

    public static void inputArr(int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at index : " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        sc.close();
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printSubArr(int arr[]){
        int tsa = 0;

        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k] + " ");
                }
                tsa++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays : " + tsa);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements in array : ");
        inputArr(arr);

        System.out.println("Entered array is : ");
        printArr(arr);

        System.out.println("Subarrays are : ");
        printSubArr(arr);

        sc.close();
    }
}
