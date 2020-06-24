import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[4][4];
        for (int i = 0; i < 4; i++) {
            String s = scanner.nextLine();
            char[] array = s.toCharArray();
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = array[j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == matrix[i][j + 1] && matrix[i][j] == matrix[i + 1][j]
                && matrix[i][j] == matrix[i + 1][j + 1]) {
                    System.out.println("NO");
                    return;
                }
            }

        }
        System.out.println("YES");
    }
}