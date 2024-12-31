/*
Reverse Insertion Sort
*/

public class Q3 {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void revInsertionSort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int current = arr[i];
            int previous = i-1;

            while(previous >= 0 && arr[previous] < current){
                arr[previous+1] = arr[previous];
                previous--;
            }

            arr[previous+1] = current;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};

        System.out.println("Array before Reverse Insertion Sort  : ");
        printArr(arr);

        revInsertionSort(arr);

        System.out.println("Array after Reverse Insertion Sort  : ");
        printArr(arr);
    }    
}
