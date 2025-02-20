import java.util.*;
public class SwapNumbers {
    public static void swap(ArrayList<Integer> list, int id1, int id2){
        int temp = list.get(id1);
        list.set(id1, list.get(id2));
        list.set(id2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int id1 = 1;
        int id2 = 3;

        System.out.println(list);
        swap(list, id1, id2);
        System.out.println(list);
    }    
}
