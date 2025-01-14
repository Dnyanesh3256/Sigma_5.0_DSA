public class DeepCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Kibo";
        s1.rollNo = 2;
        s1.marks[0] = 70;
        s1.marks[1] = 80;
        s1.marks[2] = 90;

        Student s2 = new Student(s1);
        s1.marks[0] = 35;
        System.out.println("S2 Name : " + s2.name);
        System.out.println("S2 Roll No : " + s2.rollNo);
        System.out.println("S2 Marks : ");
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
        for(int i=0;i<s.marks.length;i++){
            this.marks[i] = s.marks[i];
        }
    }
}
