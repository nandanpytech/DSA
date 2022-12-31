public class Practice {
    public static void main(String[] args) {
        int target=8;
        int[]nums={5,7,6,7,8,8,9};
        int mid=check(nums,target);
        int[]arr={-1,-1};


    }
    static int check(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>target){
                end=mid-1;
            } else if (nums[mid]<target) {
                start=start+1;
            }else{
               return  mid;
            }
        }
        return -1;
    }

}
