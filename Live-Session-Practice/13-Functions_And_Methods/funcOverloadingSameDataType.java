public class funcOverloadingSameDataType {

    public static int add(int n1,int n2){
        return n1 + n2;
    }

    public static int add(int n1,int n2,int n3){
        return n1 + n2 + n3;
    }

    public static void main(String[] args) {
        int add2 = add(5,5);
        int add3 = add(8,2,4);

        System.out.println("Addition of two numbers : " + add2);
        System.out.println("Addition of three numbers : " + add3);
    }
}
