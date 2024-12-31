import java.util.Scanner;

public class maximumSubarraySum_BruteForce {
    public static void subArrSum(int arr[]){
        int sas = 0;
        int tsas = 0;

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    sas += arr[k];
                }
                System.out.println("Subarray Sum = " + sas);
                tsas += sas;

                maxSum = Math.max(maxSum, sas);
                minSum = Math.min(minSum, sas);
            }
        }
        
        System.out.println("Total Subarray Sum = " + tsas);
        System.out.println("Maximum Sum in Subarray = " + maxSum);
        System.out.println("Minimum Sum in Subarray = " + minSum);
    }

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements in array : ");
        inputArr(arr);

        System.out.println("Entered array is : ");
        printArr(arr);

        System.out.println("Subarray Sums are : ");
        subArrSum(arr);

        sc.close();
    }
}
