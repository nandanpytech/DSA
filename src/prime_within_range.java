public class prime_within_range {
    public static void main(String[] args) {
        int a=1;
        int b=12;
        range(a,b);
    }
    static void range(int a,int b){
        for (int j=a;j<=b;j++){
            boolean ans=true;
            if(j<2){
                continue;
            }else{
                for(int i=2;i<j;i++){
                    if(j%i==0){
                        ans=false;
                        break;
                    }
                }
                if (ans){
                    System.out.println(j);
                }


            }
        }
    }
}
