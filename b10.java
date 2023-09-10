import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        System.out.println("nhập số m: ");
        int m = new Scanner(System.in).nextInt();
//        int n;
//        do {
//            System.out.println("nhập số n(m<n): ");
//            n = new Scanner(System.in).nextInt();
//        } while (m > n);
        while (true){
            System.out.println("nhập số n(m<n): ");
            int n = new Scanner(System.in).nextInt();
            if (n>m){
                soCP(m,n);
                break;
            }
        }
//        System.out.println(soCP(m,n));
    }

    public static void soCP(int a, int b) {

        for (int i = 1; i <= Math.sqrt(b); i++) {
            if (i * i > a && i * i < b) {
                System.out.println(i * i);
            }
        }

    }
}
