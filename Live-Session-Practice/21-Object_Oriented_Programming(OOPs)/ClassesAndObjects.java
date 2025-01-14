public class ClassesAndObjects {
    public static void main(String[] args) {
        Pen p = new Pen();

        System.out.println("Pen's color and tip before setting them : " + p.color + " " + p.tip);

        p.setColor("Red");

        p.setTip(8);

        System.out.println("Pen's color and tip after setting them : " + p.color + " " + p.tip);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}
