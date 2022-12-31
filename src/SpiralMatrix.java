import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        int rows=3;
        int cols=3;
        int num=0;
        int[] arr=new int[rows*cols];
        int left=0;
        int right=array[0].length;
        int top=0;
        int bottom= array.length;
        while (left<right && top<bottom){
            //to get first row element
            for (int i = left; i < right; i++) {
                arr[num++]=array[top][i];
            }
            top++;

            //to get last column element
            for (int j = top; j < bottom; j++) {
                arr[num++]=array[j][right-1];
            }
            right--;

            //for single matrix
            if (!(left<right && top<bottom)){
                break;
            }
            
            //to get bottom element
            for (int k =right-1; k >=left ; k--) {
                arr[num++]=array[bottom-1][k];
            }
            bottom--;

            //to get first column element
            for (int l=bottom-1;l>=top ; l--) {
                arr[num++]=array[l][left];
            }
            left++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
