public class b16 {
    public static void main(String[] args) {
        for (int i = 10000; i < 10000000; i++) {
            if (laSoNT(i) && laSoThuanNghich(i) && koChuaSo4(i)){
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

    public static boolean laSoThuanNghich(int a) {
        int temp = a;
        int m= 0;
        while (temp!=0){
            m = m*10+ temp%10;
            temp /=10;
        }
        return m==a;
    }
    public static boolean koChuaSo4(int a){
        int temp =a;
        while (temp!=0){
            if (temp%10==4){
                return false;
            }
            temp /=10;
        }
        return true;
    }

}
