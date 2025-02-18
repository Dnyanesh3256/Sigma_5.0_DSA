public class maximumSubarraySum_BruteForce {
    public static void subArrSum(int arr[]){
        int currSum;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                currSum = 0;
                for(int k=start;k<=end;k++){
                    currSum += arr[k];
                }
                if(currSum > maxSum){
                    maxSum = currSum;
                }
                System.out.println("Subarray Sum = " + currSum);
            }     
        }

        System.out.println("Maximum Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subArrSum(arr);
    }
}
