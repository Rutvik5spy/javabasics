
import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int[] rut = new int[4];
        // rut[3] = 89;
        // System.out.println(rut[3]);
        for (int i = 0; i < rut.length; i++) {
            rut[i] = in.nextInt();
            System.out.print(rut[i] + " ");
        }
        System.out.println(Arrays.toString(rut));
         rut[3] = 89;
        // System.out.println(rut[3]);
        System.out.println(Arrays.toString(rut));
    }
}

