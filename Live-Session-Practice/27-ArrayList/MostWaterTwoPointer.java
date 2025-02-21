import java.util.*;
public class MostWaterTwoPointer {
    public static int storedWater(ArrayList<Integer> heightList){
        int lp = 0;
        int rp = heightList.size()-1;
        int maxWater = 0;
        
        while(lp < rp){
            int height = Math.min(heightList.get(lp), heightList.get(rp));
            int width = rp-lp;
            int currWater = (height*width);
            maxWater = Math.max(maxWater, currWater);

            if(heightList.get(lp) < heightList.get(rp)){
                lp++;
            }else{
                rp--;
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
