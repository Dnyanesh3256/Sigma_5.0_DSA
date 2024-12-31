import java.util.*;
public class maximumSubarraySum_KadanesAlgo {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void inputArr(int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at index : " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        sc.close();
    }

    public static void maxSubarraySum(int arr[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            
            if(currSum < 0){
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Maximum Sum in the Subarray = " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements in array : ");
        inputArr(arr);

        System.out.println("Entered array is : ");
        printArr(arr);
        
        maxSubarraySum(arr);


        sc.close();
    }
}

