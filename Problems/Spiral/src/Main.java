import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int[] array : matrix) {
            Arrays.fill(array, 0);
        }
        int number = 1;
        int i = 0;
        int j = 0;

        boolean col = true;
        boolean asc = true;
        while (number <= n * n) {
            matrix[i][j] = number++;
            if (col) {
                if (asc) {
                    if (j + 1 < n && matrix[i][j + 1] == 0) {
                        j++;
                    } else {
                        col = false;
                        if (i + 1 < n && matrix[i + 1][j] == 0) {
                            asc = true;
                            i++;
                        } else {
                            asc = false;
                            i--;
                        }
                    }
                } else if (j - 1 >= 0 && matrix[i][j - 1] == 0) {
                    j--;
                } else {
                    col = false;
                    if (i + 1 < n && matrix[i + 1][j] == 0) {
                        asc = true;
                        i++;
                    } else {
                        asc = false;
                        i--;
                    }
                }
            } else if (asc) {
                if (i + 1 < n && matrix[i + 1][j] == 0) {
                    i++;
                } else {
                    col = true;
                    if (j + 1 < n && matrix[i][j + 1] == 0) {
                        asc = true;
                        j++;
                    } else {
                        asc = false;
                        j--;
                    }
                }
            } else if (i - 1 >= 0 && matrix[i - 1][j] == 0) {
                i--;
            } else {
                col = true;
                if (j + 1 < n && matrix[i][j + 1] == 0) {
                    asc = true;
                    j++;
                } else {
                    asc = false;
                    j--;
                }
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}