import java.util.*;
public class smallestElement {

    public static int getSmallest(int array[]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at index : " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Smallest element in an Array is : " + getSmallest(arr));

        sc.close();
    }
}
