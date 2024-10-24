public class Fibon{
    public static void main(String[] args) {
        // System.out.println("hiiiii");
        //  Scanner in = new Scanner(System.in);
        //  int n = in.nextInt();
         int a = 0;
         int b = 1;
         int count = 2;
         for (int n= 1; n<=8; n++) {
            while (count<=n) {
                int temp = b;
                b = a+b;
                a = temp;
                count ++;
             }
        if (n == 8) {
            System.out.println(b);
        }
         }
    }
}
