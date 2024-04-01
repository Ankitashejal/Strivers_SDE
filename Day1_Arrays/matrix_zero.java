
//brute_force
public class matrix_zero {
    public static void main(String[] args) {
     
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        matrix_zero solution = new matrix_zero();
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        solution.setZeroes(matrix);

        System.out.println("\nMatrix after setting zeroes:");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

         // Arrays to store rows and columns that need to be zeroed
         boolean[] zeroRows = new boolean[m];
         boolean[] zeroCols = new boolean[n];

         //marks rows and col that has zero
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    zeroRows[i] = true;
                    zeroCols[j] = true;

                }
            }
         }

         //set rows to zero
         for(int i=0;i<m;i++){
            if(zeroRows[i]){
                for(int j=0;j<n;j++){
                    matrix[i][j] = 0;
                }
   
         }
    }
    //set col to zero value
    for(int j=0;j<n;j++){
        if(zeroCols[j]){
            for(int i=0;i<m;i++){
                matrix[i][j] = 0;
            }

    }
 
}
}
}