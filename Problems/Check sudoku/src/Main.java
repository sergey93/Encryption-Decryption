import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        int[][] matrix = new int[n * n][n * n];
        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int solve = 0;
        for (int i = 1; i <= n * n; i++) {
            solve += i;
        }

        int lastIndex = (n == 1) ? n : n * (n - 1);
        for (int i = 0; i < lastIndex; i += n) {
            for (int j = 0; j < lastIndex; j += n) {
                // square
                int sum = 0;
                for (int k = i; k < i + n; k++) {
                    for (int l = j; l < j + n; l++) {
                        sum += matrix[k][l];
                    }
                }
                if (sum != solve) {
                    System.out.println("NO");
                    return;
                }
                // row
                for (int k = i; k < i + n && j == 0; k++) {
                    sum = 0;
                    for (int l = 0; l < n * n; l++) {
                        sum += matrix[k][l];
                    }
                    if (sum != solve) {
                        System.out.println("NO");
                        return;
                    }
                }
                // column
                for (int k = j; k < j + n && i == 0; k++) {
                    sum = 0;
                    for (int l = 0; l < n * n; l++) {
                        sum += matrix[l][k];
                    }
                    if (sum != solve) {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        System.out.println("YES");

    }
}