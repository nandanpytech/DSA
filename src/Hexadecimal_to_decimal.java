public class Hexadecimal_to_decimal {
    public static void main(String[] args) {
        String a="B8";
        String digits="0123456789ABCDEF";
        int base=1;
        int ans=0;
        for (int i=a.length()-1;i>=0;i--) {
            char last = a.charAt(i);
            ans+=base*(digits.indexOf(last));
            base*=16;
        }
        System.out.println(ans);

    }
}
