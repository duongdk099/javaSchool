/**
 * array2D
 */
import java.util.Scanner;
public class array2D {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input the size of 2D Array: ");
        int first2D = myObj.nextInt();
        int second2D = myObj.nextInt();
        
        int[][] array2Dim = new int[first2D][second2D];
        int max = array2Dim[0][0];
        for(int i = 0; i< first2D ; i++){
            for (int j = 0; j < second2D; j++) {
                System.out.println("The "+ (i+1) + "/" + (j+1) +" :");
                int res = myObj.nextInt();
                array2Dim[i][j] = res;
            }
        }

        System.out.println("\n");
        System.out.println("The Array:");
        for(int i = 0; i< first2D ; i++){
            for (int j = 0; j < second2D; j++) {
                System.out.println("The "+ (i+1) + "|" + (j+1) +" :" +array2Dim[i][j]);
            }
        }

        for(int i = 0; i< first2D ; i++){
            for (int j = 0; j < second2D; j++) {
                if(max < array2Dim[i][j]) max = array2Dim[i][j];
            }
        }     
        System.out.println("The maximum element from this array 2D :" + max);
    }
}