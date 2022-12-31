public class Binary_Search {
    public static void main(String[] args) {
        int[]arr={2,36,44,66,77,88,99};
        searching(arr);
    }
    static void searching(int[]arr){
        int start=0;
        int end=arr.length-1;
        int target=77;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
    }
}
