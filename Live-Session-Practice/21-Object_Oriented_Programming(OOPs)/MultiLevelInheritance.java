public class MultiLevelInheritance {
    public static void main(String[] args) {
        Ox o1 = new Ox();
        o1.eat();
        o1.walk();
        o1.legs();
    }    
}

class Animal{
    void eat(){
        System.out.println("Eats...");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("Walks...");
    }
}

class Ox extends Mammals{
    void legs(){
        System.out.println("Have legs...");
    }
}
