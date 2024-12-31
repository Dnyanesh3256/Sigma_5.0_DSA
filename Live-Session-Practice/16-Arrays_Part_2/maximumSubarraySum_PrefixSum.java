import java.util.Scanner;
public class maximumSubarraySum_PrefixSum{

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

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;

                currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }

            }
        }

        System.out.println("Maximum Sum : " + maxSum);
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