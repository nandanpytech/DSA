public class Maths2 {
    public static void main(String[] args) {
     int[]arr={3,2,4,5,4,3,5};
        System.out.println(check(arr));
    }
    static int check(int[]arr){
        int unique=0;
        for(int n:arr){
            unique=unique^n;
        }
        return unique;
    }
}
