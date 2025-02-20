import java.util.*;
public class PrintReverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(4,5);

        System.out.println("List : " + list);

        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
