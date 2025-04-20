/*
An ArrayList is monotonic if it is either monotone increasing or monotone decreasing.

An ArrayList nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j).
An ArrayList nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).

Given an Integer ArrayList nums, return true if the given list is monotonic, or false otherwise.
*/

import java.util.*;

public class Q1 {
    public static boolean isMonotonic(ArrayList<Integer> list){
        boolean increasing = true;
        boolean decreasing = true;

        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) > list.get(i+1)){
                increasing = false;
            }
        }

        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) < list.get(i+1)){
                decreasing = false;
            }
        }

        return increasing || decreasing;
    } 
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        System.out.println(isMonotonic(nums));
    }    
}
