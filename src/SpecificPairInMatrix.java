public class SpecificPairInMatrix {
    public static void main(String[] args) {
        int[][] array={{1, 2, -1, -4, -20},{ -8, -3, 4, 2, 1},{3, 8, 6, 1, 3},{-4, -1, 1, 7, -6},{0, -4, 10, -5, 1 }};
        int high=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = i+1; k < 5; k++) {
                    for (int l = j+1; l < 5; l++) {
                        if(array[k][l]-array[i][j]>high){
                            high=array[k][l]-array[i][j];
                        }
                    }
                }
            }
        }
        System.out.println(high);
    }
}
