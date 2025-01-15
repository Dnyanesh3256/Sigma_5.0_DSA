public class Interface {
    public static void main(String[] args) {
        Swift s = new Swift();
        s.compony();
        s.wheels();

        System.out.println();

        Nano n = new Nano();
        n.compony();
        n.wheels();
    }    
}

interface Car{
    void compony();
    void wheels();
}

class Swift implements Car{
    public void compony(){
        System.out.println("Maruti Suzuki");
    }

    public void wheels(){
        System.out.println("Have four wheels");
    }
}

class Nano implements Car{
    public void compony(){
        System.out.println("Tata");
    }

    public void wheels(){
        System.out.println("Have four wheels");
    }
}
