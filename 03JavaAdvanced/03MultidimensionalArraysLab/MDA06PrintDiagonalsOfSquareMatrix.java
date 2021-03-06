import java.util.Scanner;

public class MDA06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readSquareMatrix(scanner, n);

        int row = 0;
        int col = 0;
        while (row < n && col < n) {
            System.out.print(matrix[row++][col++] + " ");
        }

        System.out.println();

        row = n - 1;
        col = 0;
        while (row >= 0 && col < n) {
            System.out.print(matrix[row--][col++] + " ");
        }

    }

    private static int[][] readSquareMatrix(Scanner scanner, int n) {
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] inputRow = scanner.nextLine().split("\\s+");
            for (int col = 0; col < inputRow.length; col++) {
                int currentNumber = Integer.parseInt(inputRow[col]);
                matrix[row][col] = currentNumber;
            }
        }

        return matrix;
    }

}
