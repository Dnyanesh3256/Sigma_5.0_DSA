public class setIthBit {
    public static int ithBit(int n, int i){
        int bitMask = (1<<i);

        return (n|bitMask);
    }
    public static void main(String[] args) {
        System.out.println(ithBit(10, 2));
    }
}
