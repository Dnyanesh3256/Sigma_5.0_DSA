/*
Add 1 to an integer using bit manipulation (Not operator)
*/

public class Q3 {
    public static int addOne(int n){
        return (-(~n));
    }
    public static void main(String[] args) {
        System.out.println(addOne(5));
    }
}
