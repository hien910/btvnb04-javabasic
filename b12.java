import java.util.Scanner;

public class b12 {
    public static void main(String[] args) {
        System.out.print("Nhập ma trân a(n x n) với n= ");
        int n = new Scanner(System.in).nextInt();
        int[][] a = inputMatrix(n);
        System.out.print("tổng đường chéo chính S= "+sum(a));
    }

    public static int[][] inputMatrix(int n) {
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "]= ");
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return a;
    }
    public static int sum(int[][] a){
        int sum=a[0][0];
        for (int i = 1; i <a.length ; i++) {
            sum += a[i][i];
        }
        return sum;
    }
}
