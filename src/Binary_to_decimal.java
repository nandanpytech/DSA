public class Binary_to_decimal {
    public static void main(String[] args) {
        int a=1110;
        int base=1;
        int ans=0;
        while(a>0){
            int lst=(a&1);
            ans+=base*lst;
            base*=2;
            a/=10;

        }
        System.out.println(ans);
    }
}
