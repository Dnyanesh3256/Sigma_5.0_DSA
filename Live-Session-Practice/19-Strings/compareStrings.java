public class compareStrings {
    public static void main(String[] args) {
        String s1 = "Dnyaneshwar";
        String s2 = "Dnyaneshwar";
        String s3 = new String("Dnyaneshwar");

        if(s1 == s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1 == s3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }    
}
