public class Armstrong {
    public static void main(String[] args) {
        int a=10;
        int b=1000;
        checking(a,b);
    }
    static  void checking(int a,int b){
        for(int n=a;n<b;n++){
            int len=chekclen(n);
            int temp=n;
            int initial=0;
            while(temp>0){
                int rem=temp%10;
                initial=initial+((int)Math.pow(rem,len));
                temp/=10;
            }
            if(initial==n){
                System.out.println(n);
            }
        }


    }

    static int chekclen(int a){
        int len=0;
        while(a>0){
            len++;
            a/=10;
        }
        return len;
    }
}
