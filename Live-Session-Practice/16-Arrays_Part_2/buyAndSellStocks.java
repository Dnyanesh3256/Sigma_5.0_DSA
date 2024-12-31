import java.util.*;
public class buyAndSellStocks {
    
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

    public static int buyAndSell(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<price.length;i++){
            if(price[i] > buyPrice){
                int profit = (price[i] - buyPrice);
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = price[i];
            }
        }

        return maxProfit;
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

        int res = buyAndSell(arr);
        System.out.println(res);

        sc.close();
    }
}
