import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner tuy = new Scanner(System.in);
        String tuys = tuy.next();
       String message = greet(tuys);
       System.out.println(message);
    //    for (int i = 0; i < 4; i++) {
    //     System.out.println(i);
    //    }
    }
    static String greet(String abc){
        String greets = "hi how are you " + abc;
        return greets;
    }
    }