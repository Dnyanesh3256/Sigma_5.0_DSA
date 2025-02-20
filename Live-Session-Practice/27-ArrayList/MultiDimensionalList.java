import java.util.*;
public class MultiDimensionalList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        mainList.add(list1);
        mainList.add(list2);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(mainList);
    }
}
