import java.util.*;
public class insertionSort {

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

    public static void insertSort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int curr = arr[i];
            int prev = (i-1);

            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        inputArr(arr);
        System.out.println("Entered Array : ");
        printArr(arr); 
        insertSort(arr);
        System.out.println("Array after Insertion Sort : ");
        printArr(arr);
        sc.close();
    } 
}
