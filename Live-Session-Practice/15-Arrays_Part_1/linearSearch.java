import java.util.*;
public class linearSearch{

    public static int linSearch(int nums[], int n){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == n){
                return i;
            }
        }

        return -1;        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter in an Array : ");
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter element for index : " + i);
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the key element you want to search : ");
        int target = sc.nextInt();

        int index = linSearch(nums, target);

        if(index == -1){
            System.out.println("Element is not present");
        }else{
            System.out.println("Element is present at index " + index);
        }

        sc.close();
    }
}