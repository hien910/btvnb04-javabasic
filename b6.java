import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử của mảng n: ");
        int n= new Scanner(System.in).nextInt();
        int[] a= inputArray(n);

        if (doiXung(a)){
            System.out.println("Mảng đối xứng");
        } else {
            System.out.println("Mảng không đối xứng");
        }

    }
    public  static  int[] inputArray(int n){
//        System.out.println("Nhập số phần tử của mảng n: ");
//        int n= new Scanner(System.in).nextInt();
        int[] a= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"]= ");
            a[i]= new Scanner(System.in).nextInt();
        }
        return a;
    }
    public static boolean doiXung(int[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[a.length-1-i];
            if (b[i]-a[a.length-1-i]!=0){
                return false;
            }
        }
        return true;
    }

}
