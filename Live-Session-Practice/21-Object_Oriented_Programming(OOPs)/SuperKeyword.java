public class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.color);
    }    
}

class Animal{
    String color;
    Animal(){
        System.out.println("Inside class Animal");
    }
}

class Dog extends Animal{
    Dog(){
        super.color = "brown";
        System.out.println("Inside class Dog");
    }
}