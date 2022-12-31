import java.util.Arrays;
import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        int[] piles={30,11,23,4,20};
        int h=6;
        int max=checkmax(piles);
        int start=1;
        int end=max;
        int res=end;
        while(start<=end){
            int mid=(start+(end-start)/2);
            int ans=0;
            for (int j:piles){
                double s=Math.ceil((double) j/mid);
                ans+=(s);
            }
            if(ans<=h){
                res=Math.min(res,mid);
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println(res);

    }
    static  int checkmax(int[]piles){
        int num=0;
        for (int i:piles){
            if(i>num){
                num=i;
            }
        }
        return  num;
    }
}
