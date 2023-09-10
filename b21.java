import java.util.Arrays;
import java.util.Scanner;

public class b21 {
    public static void main(String[] args) {
        System.out.println("mảng a");
        int[] a = inputArray();
        System.out.println("mảng b");
        int[] b = inputArray();

        int[] c= sumArray(a,b);
        System.out.println("tổng của 2 mảng S="+ Arrays.toString(c));
    }

    public static int[] inputArray() {
        System.out.println("nhập vào lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static int[] sumArray(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[b.length - i -1];

        }
        return c;
    }


}
