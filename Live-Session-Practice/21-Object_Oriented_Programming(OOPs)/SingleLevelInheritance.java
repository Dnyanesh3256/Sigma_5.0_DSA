public class SingleLevelInheritance {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.sleep();
        c1.meow();
    }    
}

class Animal{
    void sleep(){
        System.out.println("Sleeps...");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Meow...");
    }
}