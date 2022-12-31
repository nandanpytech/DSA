import java.util.Arrays;
import java.util.Scanner;

public class javasas {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int rows=sc.nextInt();
//        int cols=sc.nextInt();
//        int[][] array = new int[rows][cols];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                array[i][j]=sc.nextInt();
//            }
//        }
        int rows=4;
        int cols=4;
        int[][] array={{1,2,3,4},{11,2,13,14},{21,2,23,24},{31,2,33,34}};
        int count=0;
        for (int i = 0; i <array[0].length; i++) {
            count+=check(array,array[0][i],rows,cols);
            if(count==rows-1){
                System.out.println(array[0][i]);
                break;
            }
        }

    }
    static  int check(int[][]array,int num,int rows,int cols){
        int total=0;
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(array[i][j]==num){
                    total+=1;
                }
            }

        }
        return total;
    }
}
