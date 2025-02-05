/*
Given an array of size n, return the majority element.

Divide & Conquer

Time Complexity = O(n log n)
*/

public class Q2DC{
    public static int majorityElement(int arr[]){
        return majorityElementRecursive(arr, 0, arr.length-1);
    }

    public static int majorityElementRecursive(int arr[], int si, int ei){
        if(si == ei){
            return arr[si];
        }

        int mid = (si + ei)/2;
        
        int left = majorityElementRecursive(arr, si, mid);
        int right = majorityElementRecursive(arr, mid+1, ei);

        if(left == right){
            return left;
        }

        int leftCount = countInRange(arr, left, si, ei);
        int rightCount = countInRange(arr, right, si, ei);

        return leftCount > rightCount ? left : right;
    }

    public static int countInRange(int arr[], int n, int si, int ei){
        int count = 0;

        for(int i=si;i<=ei;i++){
            if(arr[i] == n){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(arr));
    }
}