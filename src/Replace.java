public class Replace {
    public static void main(String[] args) {
        int a=94903403;
        String numbers=Integer.toString(a);
        String ans="";
        for(int i=0;i<numbers.length();i++){
            if(numbers.charAt(i)=='0'){
                ans+='1';
            }else{
                ans+=numbers.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
