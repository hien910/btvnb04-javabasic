import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        System.out.println("nhập 1 số tự nhiên n: ");
        int n= new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = new Scanner(System.in).nextInt();
        }
        System.out.println(count(a,n));
    }
    public static int count(int[] m,int p){
        int count=0;
        for (int i = 0; i < p-1; i++){
            if (m[i]==m[i+1]){
                count++;
            }
        }
        return count;

    }

}
