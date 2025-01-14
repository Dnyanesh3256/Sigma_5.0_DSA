public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        Student s2 = new Student("Aman");

        Student s3 = new Student(1);

        Student s4 = new Student("Ajay", 2);

        System.out.println(s2.name);
        System.out.println(s3.rollNo);
        System.out.println(s4.name +" " + s4.rollNo);
    }    
}

class Student{
    String name;
    int rollNo;

    Student(){
        System.out.println("In Default Constructor...");
    }

    Student(String name){
        this.name = name;
    }

    Student(int rollNo){
        this.rollNo = rollNo;
    }

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
}
