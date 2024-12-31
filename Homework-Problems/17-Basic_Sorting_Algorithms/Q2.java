/*
Reverse Selection Sort
*/

public class Q2 {
    public static void revSelectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minPos = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] > arr[minPos]){
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};

        System.out.println("Array before Reverse Selection Sort  : ");
        printArr(arr);

        revSelectionSort(arr);

        System.out.println("Array after Reverse Selection Sort : ");
        printArr(arr);
    }
}
