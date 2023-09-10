import java.util.Scanner;

public class b13 {
    public static void main(String[] args) {
        System.out.println("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("S = "+ tongS(n));


    }

    public static double tongS(int a) {
//        int n = new Scanner(System.in).nextInt();
        double s = 0;
        for (int i = 1; i <= a; i++) {
           s = s+ (double) 1 /i;
        }
        return s;
    }

}
