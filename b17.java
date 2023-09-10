import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class b17 {
    public static void main(String[] args) {
        System.out.println("nhập ma trận a: ");
        int[][] a= inputMatrix();
        System.out.println(Arrays.deepToString(a));
        System.out.println("nhập ma trận b: ");
        int[][] b= inputMatrix();
        System.out.println(Arrays.deepToString(b));
//        System.out.println(a.length);
//        System.out.println(a[0].length);
        System.out.println("Tổng 2 ma trận là: S= "+Arrays.deepToString(sumMatrix(a,b)));

    }
    public static int[] [] inputMatrix(){
        System.out.println("nhập vào m dòng, n cột: ");
        int m = new Scanner(System.in).nextInt();
        int n = new Scanner(System.in).nextInt();
        int[] [] a= new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a["+i+"]["+j+"]= ");
                a[i][j]= new Scanner(System.in).nextInt();
            }
        }
        return a;
    }
    public static int[][] sumMatrix(int[][] a, int[][] b){
        int[][] s = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                s[i][j]= a[i][j]+b[i][j];
            }
        }
        return s;
    }

}
