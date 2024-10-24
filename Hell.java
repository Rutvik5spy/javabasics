
public class Hell{
   public static void main(String[] args) {
      // Scanner input = new Scanner(System.in);
      // int a = input.nextInt();
      // int b = input.nextInt();
      // int c = input.nextInt();
      // int max = a;                                                for maximum number between 3.
      // if (b > max) {
      //    max =b;
      // }
      // if(c >max){
      //    max = c;
      // }
      // System.out.println(max);
   //  System.out.println("hello");
    int a,b ;
    a = 36;
    if (a<= 1) {
      System.out.println("neither prime nor composite");
    }
    b = 2;     
   while (b*b<=a) {
      if (a % b == 0) {
         System.out.println("not prime");  
         break;
      }
      System.out.println(a +" prime number");
      break;
   }

   // int salary = input.nextInt();
   // System.out.println("Enter the salary " + salary);
   // if (salary>10000) {
   //    salary += 2000;                                               for salary problem
   // } else {
   //    salary +=1000;
   // }
   // System.out.println("the final salary is " + salary);
   // int b = input.nextInt();                                         for greater number.
   // if(a>b){
   //    System.out.println("first number is greater " + a);
   // }else{
   //    System.out.println("2nd number is greater " + b);
   // }
   
   }
}