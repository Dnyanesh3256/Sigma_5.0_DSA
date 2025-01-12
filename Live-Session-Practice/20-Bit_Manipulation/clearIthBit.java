public class clearIthBit {
    public static int clrIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return (n & bitMask);
    }

    public static void main(String[] args) {
        System.out.println(clrIthBit(10, 1));
    }
}
