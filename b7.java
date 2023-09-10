import java.util.Scanner;

public class b7 {
    public static void main(String[] args) {

    }
    public static int[] nhapMang() {
        System.out.println("nhập vào số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");

            while (true){
                a[i] = new Scanner(System.in).nextInt();
            }
        }
        return a;
    }
    public static int nhapso(){
        System.out.println("nhập 1 dãy số có n phần tử: ");
        for (int i = 0; true; i++) {
//            if ()
//            int a =new Scanner(System.in).nextInt();

        }


    }
}
