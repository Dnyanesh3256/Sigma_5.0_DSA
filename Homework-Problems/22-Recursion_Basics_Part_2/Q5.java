/*
Tower Of Hanoi
*/

public class Q5 {
    public static void towerOfHanoi(int n, int A, int C, int B){
        if(n == 0){
            return;
        }

        towerOfHanoi(n-1, A, B, C);
        System.out.println("Moving " + n + "th disk from " + A + " to " + B);
        towerOfHanoi(n-1, B, C, A);
    }
    public static void main(String[] args) {
        towerOfHanoi(3, 10 , 30, 20);
    }
}
