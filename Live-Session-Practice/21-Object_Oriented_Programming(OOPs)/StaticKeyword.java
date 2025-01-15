public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.rollNo = 1;
        s1.schoolName = "ZPPS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student{
    String name;
    int rollNo;

    static String schoolName;
}
