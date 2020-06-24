import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
                if (i == 0 && j == 0) {
                    max = matrix[i][j];
                }
            }
        }

        int rowMax = 0; int columnMax = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    rowMax = i;
                    columnMax = j;
                }
            }
        }
        System.out.println(rowMax + " " + columnMax);
    }
}