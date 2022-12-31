public class LCM {
    public static void main(String[] args) {
        int a=6;
        int b=4;
        int lcm=0;
        for(int i=Math.max(a,b);i<=a*b;i++){
            if(i%a==0 && i%b==0){
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
