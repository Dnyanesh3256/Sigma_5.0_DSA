/*
Print the number of 7's that are in the 2D Array
*/

public class Q1 {
    public static int count(int arr[][], int key){
        int counter = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == key){
                    counter++;
                }
            }
        }

        System.out.println("The total number of " + key + " : " + counter);
        return counter;
    }
    public static void main(String[] args) {
        int arr[][] = {{4,7,8},{8,8,7}};

        count(arr, 7);
    }    
}
