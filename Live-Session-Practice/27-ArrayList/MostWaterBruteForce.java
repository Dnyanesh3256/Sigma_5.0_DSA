import java.util.*;

public class MostWaterBruteForce {
    public static int storedWater(ArrayList<Integer> list){
        int n = list.size();
        int maxWater = 0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int height = Math.min(list.get(i), list.get(j));
                int width = (j-i);
                int currWater = (height*width);
                maxWater = Math.max(maxWater, currWater);
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(storedWater(list));
    }
}
