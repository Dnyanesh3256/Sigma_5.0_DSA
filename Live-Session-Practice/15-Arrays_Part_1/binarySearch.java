import java.util.*;
public class binarySearch {

    public static int binSearch(int arr[], int target){
        int start = 0;
        int end = (arr.length - 1);

        while(start <= end){
            int mid = (start + end)/2;

            if(arr[mid] == target){
                return mid;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter in Sorted Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at index : " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to search in Array : ");
        int target = sc.nextInt();

        int index = binSearch(arr, target);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index : " + index);
        }

        sc.close();
    }
}
