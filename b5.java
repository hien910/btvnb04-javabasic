import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        System.out.println("nhập vào 2 số b, c lần lượt là: ");
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int[] a = nhapMang();
        System.out.println("tbc: "+ tbc(a,b,c));

    }


    public static int[] nhapMang() {
        System.out.println("nhập vào số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static double tbc(int[] a, int b, int c) {
        int t = 0;
        int s = 0;
        double tbc = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= b && a[i] <= c) {
                t++;
                s = s + a[i];
            }
            tbc = (double) s / t;
        }
        return tbc;
    }

}
