import java.util.Arrays;
import java.util.Scanner;

public class b19 {
    public static void main(String[] args) {

        int[] a = inputArray();
        System.out.println("số chẵn có trong mảng là: "+countchan(a));
        System.out.println("số lẻ có trong mảng là: "+countle(a));

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
    public static int countchan(int[] a){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i]&2)==0){
                count++;
            }
        }
        return count;
    }
    public static int countle(int[] a){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i]&2)!=0){
                count++;
            }
        }
        return count;
    }
}
