public class MethodOverloading {
    public static void main(String[] args) {
        Addition ad = new Addition();
        System.out.println(ad.add(5, 5));
        System.out.println(ad.add((float)2.5, (float)2.5));
    }    
}

class Addition{
    int add(int a, int b){
        return (a+b);
    }

    float add(float a, float b){
        return (a+b);
    }
}
