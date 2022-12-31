public class Permutation {
    public static void main(String[] args) {
        int people=9;
        int seats=5;
        System.out.println(factorial(people)/factorial(people-seats));
    }
    static int factorial(int a){
        if(a<=1){
            return 1;
        }
        int ans=a*factorial(a-1);
        return ans;
    }
}
