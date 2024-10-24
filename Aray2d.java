
import java.util.Arrays;
import java.util.Scanner;

public class Aray2d {
    public static void main(String[] args) {
        // int[][] tuu = new int[4][];
        Scanner in = new Scanner(System.in);
        // int[][] tu0u= {
        //     {4,5,6,6},
        //     {4,5,6,6,7,8,9},
        //     {4,89},
        //     {4,4,6,7}
        // };
        int[][] rut = new int[3][2];
        // System.out.println(rut.length);
        for (int[] rut1 : rut) {
            for (int col = 0; col < rut1.length; col++) {
                rut1[col] = in.nextInt();
                // System.out.print(rut[row][col] + " ");
            }
            // System.out.println();
        }
        // for(int row = 0; row < rut.length; row++){
        //     System.out.println(Arrays.toString(rut[row]));
        // }
        for (int[] rut1 : rut) {
            System.out.println(Arrays.toString(rut1));
        }
    }
}
