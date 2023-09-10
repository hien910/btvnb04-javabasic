public class b1 {
    public static void main(String[] args) {

        for (int i = 1000000; i < 1000000000; i++) {
            if (chiaHetCho10(i) && chuaSo068(i) && thuan_nghich(i)){
                System.out.println(i);
            }
        }
    }
    public  static boolean chuaSo068(int a){
        while(a>0){
            if (a%10 !=0 && a%10 != 6 && a%10 !=8){
                return false;
            }
            a /= 10;
        }
        return true;
    }
    public static boolean chiaHetCho10(int a){
        int sum = 0;
        while(a>0){
            sum += a%10;
            a /= 10;
        }
        return sum % 10 == 0;
    }

    public static boolean thuan_nghich(int a){
        int temp = a;
        int m = 0;
        while (temp!=0){
            m = m*10 + (temp%10);
            temp= temp/10;
        }
        return m == a;
    }


}
