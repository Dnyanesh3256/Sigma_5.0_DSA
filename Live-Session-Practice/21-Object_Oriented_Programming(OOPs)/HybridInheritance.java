public class HybridInheritance {
    public static void main(String[] args) {
        System.out.println("Tuna : ");
        Tuna t = new Tuna();
        t.eat();
        t.swim();
        t.tuna();
        System.out.println();

        System.out.println("Shark : ");
        Shark s = new Shark();
        s.eat();
        s.swim();
        s.shark();
        System.out.println();

        System.out.println("Peocock : ");
        Peocock p = new Peocock();
        p.eat();
        p.fly();
        p.peocock();
        System.out.println();

        System.out.println("Dog : ");
        Dog d = new Dog();
        d.eat();
        d.legs();
        d.dog();
        System.out.println();

        System.out.println("Cat : ");
        Cat c = new Cat();
        c.eat();
        c.legs();
        c.cat();
        System.out.println();

        System.out.println("Human : ");
        Human h = new Human();
        h.eat();
        h.legs();
        h.human();
        System.out.println();
    }    
}

class Animal{
    void eat(){
        System.out.println("Eats...");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims...");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly...");
    }
}

class Mammals extends Animal{
    void legs(){
        System.out.println("Have legs...");
    }
}

class Tuna extends Fish{
    void tuna(){
        System.out.println("I am Tuna...");
    }
}

class Shark extends Fish{
    void shark(){
        System.out.println("I am Shark...");
    }
}

class Peocock extends Bird{
    void peocock(){
        System.out.println("I am Peocock...");
    }
}

class Dog extends Mammals{
    void dog(){
        System.out.println("I am Dog...");
    }
}

class Cat extends Mammals{
    void cat(){
        System.out.println("I am Cat...");
    }
}

class Human extends Mammals{
    void human(){
        System.out.println("I am Human...");
    }
}