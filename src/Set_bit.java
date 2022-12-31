public class Set_bit {
    public static void main(String[] args) {
        int n=15;
        int k=3;
        System.out.println(setbit(n,k));
        System.out.println(resetbit(n,k));
    }
    static  int setbit(int n,int k){
        return (n| (1<<(k-1)));                          //Or operation
    }

    static  int resetbit(int n, int k){
        return (n& (1<<(k-1)));
    }
}
