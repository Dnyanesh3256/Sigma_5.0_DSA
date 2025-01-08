public class shortestPath {
    public static float getShortestPath(String str){
        int x = 0;
        int y = 0;

        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);

            if(dir == 'E'){
                x++;
            }else if(dir == 'W'){
                x--;
            }else if(dir == 'S'){
                y--;
            }else{
                y++;
            }
        }

        int X2 = (x*x);
        int Y2 = (y*y);

        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println(getShortestPath(path));
    }    
}
