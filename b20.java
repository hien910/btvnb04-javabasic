import java.util.Scanner;

public class b20 {
    public static void main(String[] args) {
        System.out.println("nhập vào số nguyên x: ");
        int x = new Scanner(System.in).nextInt();
        int[] a = inputArray();
        System.out.println("số lần xuất hiện của x trong mảng là: "+count(a,x));

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
    public static int count(int[] a, int x){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==x){
                count++;
            }
        }
        return count;
    }

}
