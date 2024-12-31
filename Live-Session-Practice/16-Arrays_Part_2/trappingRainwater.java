import java.util.*;
public class trappingRainwater {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void inputArr(int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at index : " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        sc.close();
    }

    public static int trap(int arr[]){
        int n = arr.length;

        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += (waterLevel-arr[i]);
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter elements in array : ");
        inputArr(arr);

        System.out.println("Entered array is : ");
        printArr(arr);

        int res = trap(arr);
        System.out.println(res);

        sc.close();
    }
}
