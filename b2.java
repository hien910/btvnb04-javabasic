public class b2 {
    public static void main(String[] args) {
        for (int i = 1000000; i <=9999999 ; i++) {
            if (cacChuSoNguyenTo(i)&& soNguyenTo(i)&&ngichDaoLaSNT(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean cacChuSoNguyenTo(int a){
        int s = 0;
        while(a>0){
            s = a%10;
            if (s!=2 && s!=3  && s!=5 && s!=7){
                return false;
            }
            a /= 10;
        }
        return true;
    }
    public static boolean soNguyenTo(int a){
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean ngichDaoLaSNT(int a){
        int temp = a;
        int m = 0;
        while (temp!=0){
            m = m*10 + (temp%10);
            temp= temp/10;
        }
        return soNguyenTo(m);
    }
}
