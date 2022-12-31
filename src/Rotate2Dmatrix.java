public class Rotate2Dmatrix {
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int rows=4;
        int cols=3;
        transpose(array,rows,cols);
        sortit(array,rows,cols);
        // Loop through all rows
        for (int i = 0; i < array.length; i++)
            // Loop through all elements of current row
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");


    }
    static void transpose(int[][]array,int rows,int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < cols; j++) {
                int temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }
    }

    static void sortit(int[][]array,int rows,int cols){
        for (int i = 0; i < rows; i++) {
            int start=0;
            int end=array[i].length-1;
            while(start<end){
                int temp=array[i][start];
                array[i][start]=array[i][end];
                array[i][end]=temp;
                start++;
                end--;
            }

        }
    }
}
