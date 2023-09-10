import java.util.Scanner;

public class b15 {
    public static void main(String[] args) {
        System.out.println("nhập m: ");
        int m = new Scanner(System.in).nextInt();

        System.out.println("nhập n: ");
        int n = new Scanner(System.in).nextInt();
        if (haiSoNTCungNhau(m,n)){
            System.out.println("là 2 số nguyên tố cùng nhau");
        }else {
            System.out.println("Không là 2 số nguyên tố cùng nhau");
        }

    }

    public static boolean haiSoNTCungNhau(int a, int b) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0 && b % i == 0) {
                return false;
            }
        }
        return true;
    }
}
