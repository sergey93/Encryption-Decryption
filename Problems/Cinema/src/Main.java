import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] cinema = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cinema[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        int row = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (cinema[i][j] == 0) {
                    count++;
                    if (count == k) {
                        row = i + 1;
                        i = n;
                        break;
                    }
                } else {
                    count = 0;
                }
            }
        }
        System.out.println(row);
    }
}