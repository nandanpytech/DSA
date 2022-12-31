public class Natural_number_sum {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum_(n));
    }
    static int  sum_(int n){
        if(n==1){
            return 1;
        }
        return n+sum_(n-1);
    }
}
