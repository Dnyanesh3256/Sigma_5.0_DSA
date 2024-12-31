/*
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k 
(1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   
nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   
For   example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of 
target if it is in nums, or -1   if it is not in nums.
You must write an algorithm with O(log n) runtime complexity
*/

import java.util.Scanner;

public class Q2 {

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

    public static int check(int arr[], int target){
        int n = arr.length;
        int left = 0;
        int right = (n-1);

        //finding shift
        while(left < right){
            int mid = (left+right)/2;
            if(arr[mid] > arr[right]){
                left = mid+1;
            }else{
                right = mid;
            }
        }

        int shift = left;

        //searching
        left = 0;
        right = n-1;

        while(left <= right){
            int mid = (left + right)/2;
            int rMid = (mid + shift) % n;

            if(arr[rMid] == target){
                return rMid;
            }else if(arr[rMid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the rotated Sorted Array : ");
        inputArr(arr);

        printArr(arr);

        System.out.println("Enter element to check");
        int target = s.nextInt();

        int result = check(arr, target);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
        
        s.close();
    }
}
