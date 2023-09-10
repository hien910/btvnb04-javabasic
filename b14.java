import java.util.Scanner;

public class b14 {
    public static void main(String[] args) {
        System.out.println("nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        soLe(n);
        soChan(n);
    }
    public static void soLe(int n){
        for (int i = 0; i < n; i++) {
            if (i%2!=0){
                System.out.println("các số lẻ nhỏ hơn n:"+i);
            }
        }
    }
    public static void soChan(int n){
        for (int i = 0; i < n; i++) {
            if (i%2==0){
                System.out.println("các số chẵn nhỏ hơn n:"+i);
            }
        }
    }
}
