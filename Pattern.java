public class Pattern {
    public static void main(String[] args) {
    //    for (int i = 0; i < 5; i++) {
    //        for (int j = 0; j < 4; j++) {
    //         System.out.print("*");
    //        }
    //       System.out.println();
    //    }
   int arr[] = {2,3,4,78,98,92};
   int Big = arr[0];
   int big2 = arr[0];
   for (int i = 0; i < arr.length; i++) {
           if (arr[i]>Big) {
            Big = arr[i];
           }
           if (Big<arr[i]) {
            big2 = arr[i];
        }
   }
   System.out.println(Big);
   System.out.println(big2);
    }
}
