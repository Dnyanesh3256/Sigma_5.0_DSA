public class funcOverloadingDiffDataType{

    public static int add(int n1,int n2){
        return (n1 + n2);
    }

    public static float add(float n1,float n2){
        return (n1 + n2);
    }

    public static void main(String[] args) {
        int addInt = add(5,6);
        float addFloat = add(10.0f,5.2f);

        System.out.println("Addition of int numbers : " + addInt);
        System.out.println("Addition of float numbers : " + addFloat);
    }
}