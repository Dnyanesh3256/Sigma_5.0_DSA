public class HierachialInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }    
}

class Animal{
    void eat(){
        System.out.println("Eats...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barks...");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Meow...");
    }
}