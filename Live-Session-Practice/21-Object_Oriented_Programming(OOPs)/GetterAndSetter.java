public class GetterAndSetter {
    public static void main(String[] args) {
        Pen p = new Pen();

        p.setColor("Red");
        p.setTip(6);

        p.getColor();
        p.getTip();
    }    
}

class Pen{
    int tip;
    String color;

    void getTip(){
        System.out.println(tip);
    }

    void setTip(int newTip){
        this.tip = newTip;
    }

    void getColor(){
        System.out.println(color);
    }

    void setColor(String newColor){
        this.color = newColor;
    }
}
