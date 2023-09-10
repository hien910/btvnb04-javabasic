import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        int[] a = nhapMang();
        int b = a[vitrimax2(a)];

        System.out.println("số lớn thứ 2 trong mảng là: " + b + " ở vị trí " + vitrimax2(a));
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

    public static int vitrimax2(int[] a) {
        int max1 = a[0];
        int max2 = -1;
        int index1 = 0;
        int index2 = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                index2 = index1;
                index1 = i;
                max1=a[i];
            } else if (a[i] > max2) {
                index2 = i;
                max2=a[i];
            }
        }
        return index2;
    }

//    public static int vitrimax2(int[] a) {
//        int t = 0;
//        int max = a[vitrimax(a)];
//        for (int i = 0; i < vitrimax(a)-1; i++) {
//            if ( a[i] =Math.min(,) {
//                t = i;
//            }
//        }
//
//        return t;
}

