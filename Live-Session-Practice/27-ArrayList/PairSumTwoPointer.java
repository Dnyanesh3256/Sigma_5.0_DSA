import java.util.*;
public class PairSumTwoPointer {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp < rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            
            if(list.get(lp) + list.get(rp) > target){
                rp--;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(pairSum(list, 5));
    }
}
