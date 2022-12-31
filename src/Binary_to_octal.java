public class Binary_to_octal {
    public static void main(String[] args) {
        int a=1100;
        int n=convertodecimal(a);
        int[]ans=new int[20];
        int j=0;
        while(n>0){
            int rem=n%8;
            ans[j++]=rem;
            n=n/8;

        }
        for(int k=j-1;k>=0;k--){
            System.out.print(ans[k]);
        }

    }
    static int convertodecimal(int a){
        int ans=0;
        int base=1;
        while(a>0){
            int last=a&1;
            ans+=base*last;
            base=base*2;
            a=a/10;
        }
        return ans;
    }

}
