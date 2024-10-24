public class Armstrong {
    public static void main(String[] args) {
                                                // Scanner in = new Scanner(System.in);
                                                // System.out.println("Enter your Number");
                                                // int n = in.nextInt();
        int sum = 0;
        for (int i = 100; i < 200; i++) {
            if(Isarmstrong(i)){
                  System.out.print(i + " ");
                  sum = sum + i;
            }
        }
                                                // Boolean ans = Isarmstrong(n);
                                                // System.out.println(ans);
        System.out.println(sum);  //SUM OF THE ARMSTRONG NUMBER
    }
    static Boolean Isarmstrong(int n) {
       int orginal = n;
       int sum = 0;
       while (n > 0) {
              int rem = n%10;
               n /=10;
               sum = sum + rem*rem*rem;
              }
        return orginal == sum;
    }
}
