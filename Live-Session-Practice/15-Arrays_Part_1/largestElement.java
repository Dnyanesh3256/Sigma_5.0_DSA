import java.util.*;
public class largestElement {

    public static int getLargest(int array[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at index :" + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Largest element in an Array is : " + getLargest(arr));
        
        sc.close();
    }
}
