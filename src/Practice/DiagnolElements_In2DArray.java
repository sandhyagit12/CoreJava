package Practice;

public class DiagnolElements_In2DArray {
    public static void main(String[] args) {
        int[][] x = {{4, 5, 6},
                     {7, 8, 9},
                     {10, 11, 12}};
        if (x.length != x[0].length) {
            System.out.println("cannot print the diagnol elements");
        } else {
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[0].length; j++) {
                    if (i == j) {
                        System.out.println(x[i][j]);
                    }
                }

            }
        }
    }
}