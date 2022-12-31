public class Maths1 {
    public static void main(String[] args) {
        int n=67;
        System.out.println(isOdd(n));
    }
    static  int isOdd(int n){
        return (n&1);
    }
}
