import java.util.Arrays;
import java.util.Scanner;

public class b8 {
    public static void main(String[] args) {
        System.out.println("Nhập ma trận a cấp mxn: ");
        System.out.print("m= ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("n= ");
        int n = new Scanner(System.in).nextInt();
        int[][] a = inputMatrix(m,n);
        int[][] b = inputMatrix1(a);
        int[][] c = multiMatrix(a,b);

        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));
        System.out.println("Tích ma trân a x b = "+ Arrays.deepToString(c));


    }
    public static int[][] inputMatrix(int m , int n){
        int[] [] a= new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a["+i+"]["+j+"]= ");
                a[i][j]= new Scanner(System.in).nextInt();
            }
        }
        return a;
    }
    public static int[][] inputMatrix1(int[][] a){
        System.out.println("số dòng của ma trận 2 là: "+a[0].length);
        System.out.print("nhập số cột của ma trận 2: ");
        int m = new Scanner(System.in).nextInt();
        int[][] b= new int[a[0].length][m];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a["+i+"]["+j+"]= ");
                b[i][j]= new Scanner(System.in).nextInt();
            }
        }
        return b;
    }
    public static int[][] multiMatrix(int[][] a, int[][] b){
        int[][] c= new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                c[i][j]= 0;
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

}
