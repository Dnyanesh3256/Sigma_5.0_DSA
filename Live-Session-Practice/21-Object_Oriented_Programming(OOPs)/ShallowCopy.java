public class ShallowCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amar";
        s1.rollNo = 1;
        s1.marks[0] = 80;
        s1.marks[1] = 90;
        s1.marks[2] = 100;

        Student s2 = new Student(s1);
        s1.marks[0] = 50;
        System.out.println("S2 Name : " + s2.name);
        System.out.println("S2 Roll No : " + s2.rollNo);
        for(int i=0;i<s2.marks.length;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int rollNo;
    int marks[] = new int[3];

    Student(){

    }

    Student(Student s){
        this.name = s.name;
        this.rollNo = s.rollNo;
        this.marks = s.marks;
    }
}
