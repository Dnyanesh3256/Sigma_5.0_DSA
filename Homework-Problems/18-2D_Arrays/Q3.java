/*
Write a program to find Transpose of a Matrix
*/
public class Q3 {
    public static void main(String[] args) {
        int arr[][] = {{11,12,13},{14,15,16},{17,18,19}};

        System.out.println("Original Matrix : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
