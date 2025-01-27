/*
For a given integer array of size n. You have to find all the occurences of a given element and print
them. Use a recursive function to solve this problem.
*/

public class Q1 {
    public static void occurencesOfEle(int arr[], int key, int idx){
        if(idx == arr.length){
            return;
        }

        if(arr[idx] == key){
            System.out.println(idx + " ");
        }

        occurencesOfEle(arr, key, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        
        occurencesOfEle(arr, 2, 0);
    }
}
