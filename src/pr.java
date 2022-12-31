import java.lang.reflect.Array;
import java.util.Arrays;

public class pr {
    public static void main(String[] args) {
        int[]nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[]nums2 = {2,5,6};
        int n = 3;

        int p1=m-1,p2=n-1,i=m+n-1;
        while(p2>-1){
            if(nums1[p1]>nums2[p2]){
                nums1[i--]=nums1[p1--];
            }else{
                nums1[i--]=nums2[p2--];
            }
        }
        System.out.println(Arrays.toString(nums1));

    }

}
