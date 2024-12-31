/*
Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct
*/

import java.util.*;
public class Q1{

    public static void inputArr(int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at index : " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        sc.close();
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean check(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        inputArr(arr);

        printArr(arr);

        if(check(arr)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        };

        sc.close();
    }
}