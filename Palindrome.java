import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 0;
        int temp = a;
        while (a > 0) {
            int rem = a % 10;
            sum =  sum*10 + rem;
            a /= 10; // here a value changes.
        }
        if(sum == temp){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("no palindrome");
        }
    }
}
