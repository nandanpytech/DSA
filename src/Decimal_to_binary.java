public class Decimal_to_binary {
    public static void main(String[] args) {
        int a=12;
        int[]ans=new int[20];
        int j=0;
        while(a>0){
            int rem=a%2;
            ans[j++]=rem;
            a=a/2;
        }
        System.out.println(ans);
        for(int i=j-1;i>=0;i--){
            System.out.print(ans[i]);
        }




    }
}
