public class Number_sum {
    public static void main(String[] args) {
        int a=1234;
        sum_it(a);
    }
    static void sum_it(int a){
        int ans=0;
        while(a>0){
            int rem=a%10;
            ans+=rem;
            a/=10;
        }
        System.out.println(ans);
    }
}
