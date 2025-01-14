public class AbstractClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.walk();
        System.out.println(d.color);

        d.chaneColor();
        System.out.println(d.color);
    }    
}

abstract class Animal{
    String color;
    Animal(){
        color = "gray";
    }

    void eat(){
        System.out.println("Eats...");
    }

    abstract void walk();
}

class Dog extends Animal{
    void chaneColor(){
        color = "Black";
    }

    void walk(){
        System.out.println("Walks on four legs...");
    }
}

class Human extends Animal{
    void changeColor(){
        color = "Skin Color";
    }
    void walk(){
        System.out.println("Walks on two legs...");
    }
}
