public class neww {
    public static void main(String[] args) {
        String result="";
        String S="aax";
        String T="ddz";
        int K=3;
        if(check(S,T,K)){
            result+="Yes";
        }else{
            result+="No";
        }
        System.out.println(result);
    }
    static  boolean check(String S,String T,int K){

        for(int i=0;i<S.length();i++){
            boolean n=false;
            char first=S.charAt(i);
            char second=T.charAt(i);
            for(int j=1;j<=K;j++){
                if((char)(first+j)==second){
                    n=true;
                    break;
                }
            }
            if(n!=true){
                return false;
            }

        }
        return true;
    }




}
