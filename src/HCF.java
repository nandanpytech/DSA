public class HCF {
    public static void main(String[] args) {
        int a=36;
        int b=40;
        int hcf=0;
        for(int i=1;i<=Math.max(a,b);i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);
    }
}
