import java.util.*;
public class arrayReverse {

    public static void revArr(int arr[]){
        int first = 0;
        int last = (arr.length-1);

        while(first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at index : " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before reverse operation : ");
        printArr(arr);

        revArr(arr);

        System.out.println("Array after reverse operation : ");
        printArr(arr);
        
        sc.close();
    }
}
