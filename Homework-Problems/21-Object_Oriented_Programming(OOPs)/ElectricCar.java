/*
What will be the output of the following program ?
*/

class Automobile{
    private String drive(){
        return "Driving Vehicle";
    }
}

class Car extends Automobile{
    protected String drive(){
        return "Driving Car";
    }
}

public class ElectricCar extends Car{
    @Override
    public final String drive(){
        return "Driving Electric Car";
    }

    public static void main(String[] args) {
        final Car car = new ElectricCar();
        System.out.println(car.drive());
    }
}