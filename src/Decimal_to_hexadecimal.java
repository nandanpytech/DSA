import java.util.Arrays;

public class Decimal_to_hexadecimal {
    public static void main(String[] args) {
        int a=124;
        char[] newarr=new char[100];
        int i=0;
        while(a>0){
            int rem=a%16;
            if(rem<10){
                newarr[i]=(char)(rem+48);
                i++;
            }else{
                newarr[i]=(char)(rem+55);
                i++;
            }

            a=a/16;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(newarr[j]);
        }
    }
}
