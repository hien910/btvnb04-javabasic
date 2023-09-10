import java.util.Scanner;

public class b11 {
    public static void main(String[] args) {
        System.out.println("Nhập ma trận a cấp mxn: ");
        System.out.print("m= ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("n= ");
        int n = new Scanner(System.in).nextInt();
        int[][] a = inputMatrix(m,n);
        System.out.println("Max: "+max(a));
        System.out.println("Min: "+min(a));


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
    public static int max(int[][] a){
        int max= a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (max<a[i][j]){
                    max=a[i][j];

                }
            }
        }
        return max;
    }public static int min(int[][] a){
        int min= a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (min>a[i][j]){
                    min=a[i][j];

                }
            }
        }
        return min;
    }
}
