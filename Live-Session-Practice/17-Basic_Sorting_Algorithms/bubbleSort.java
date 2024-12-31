import java.util.Scanner;

public class bubbleSort {

    public static void inputArr(int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at index : " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println();
        sc.close();
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubSort(int arr[]){
        int n = arr.length;
        boolean swap = false;
        int numOfSwap = 0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                    numOfSwap++;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.println("Number of swaps made : " + numOfSwap);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        inputArr(arr);
        System.out.println("Array before Bubble Sort : ");
        print(arr);
        bubSort(arr);
        System.out.println("Array after Bubble Sort : ");
        print(arr);

        sc.close();
    }
}