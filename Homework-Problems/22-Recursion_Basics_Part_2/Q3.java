/*
Write a program to find Length of a String using recursion
*/

public class Q3 {
    public static int  lenStr(String str){
        if(str.isEmpty()){
            return 0;
        }

        return lenStr(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        System.out.println(lenStr("Dnyaneshwar"));
    }
}
