import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[]arr={4,5,1,2,3};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int c=getMax(0, arr.length-i-1,arr);
            swap(c,arr.length-i-1,arr);
        }
    }
    static void swap(int c,int d,int[]arr2){
        int temp=arr2[c];
        arr2[c]=arr2[d];
        arr2[d]=temp;
    }
    static int getMax(int a,int b,int[]arr){
        int maxone=a;
        for(int i=a;i<=b;i++){
            if(arr[i]>arr[maxone]){
                maxone=i;
            }
        }
        return maxone;
    }
}
