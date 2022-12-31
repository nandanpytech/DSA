public class range_sum {
    public static void main(String[] args) {
        int a=3;
        int b=6;
        System.out.println(summ(0,a,b));
    }
    static int summ(int sum,int a,int b){
        if(a>b){
            return sum;
        }
        return a+summ(sum,a+1,b);
    }
}
