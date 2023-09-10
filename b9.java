public class b9 {
    public static void main(String[] args) {
        for (int i = 100000; i < 1000000; i++) {
            if (laSoNT(i) && tongChiaHet10(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean laSoNT(int a) {
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean tongChiaHet10(int a) {
        int m = 0;
        int temp = a;
        while (temp != 0) {
            m = m + temp % 10;
            temp /= 10;
        }
        return m % 10 == 0;
    }
}
