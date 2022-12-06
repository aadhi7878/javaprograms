import java.util.Scanner;
public class book6 {
 
    private static void printMatrix(int[][] matrix, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
            System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void input(int[][] matrix, int row, int column) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    private static int[][] multiply(int[][] matrix1, int[][] matrix2, int row1, int column1, int row2, int column2) {
        int[][] result = new int[row1][column2];
        if(column1==row2){
            for(int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    for (int k = 0; k < column1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return result;
        }else{
            return null;
        }
    }

    public static void main(String args[]) {
        int row1;
        int column1;
        int row2;
        int column2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enterthe numbner of rows in first matrix : ");
        row1 = scanner.nextInt();
        System.out.println("Enter the number of columns in first matrix : ");;
        column1 = scanner.nextInt();

        int[][] matrix1 = new int[row1][column1];
        System.out.println("Enter the First Matrix :");
        input(matrix1, row1, column1);

        System.out.println("Enter number of rows of second matrix : ");
        row2 = scanner.nextInt();
        System.out.println("Enter the number of columns in second matrix : ");
        column2 = scanner.nextInt();

        int[][] matrix2 = new int[row2][column2];
        System.out.println("Enter the second Matrix :");
        input(matrix2, row2, column2);
        if(multiply(matrix1, matrix2, row1, column1, row2, column2)!=null){
            int[][] result = multiply(matrix1, matrix2, row1, column1, row2, column2);
            System.out.println("First matrix * Second Matrix : ");
            printMatrix(result, row1, column2);
        }else{
            System.out.println("there should number of columns in first matrix and number of rows in second matrix should be equal");
        }
        scanner.close();
    }
}
