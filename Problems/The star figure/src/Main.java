import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[][] matrix = new String[size][size];
        for (int i = 0; i < size; i++) {
            String symbol = ".";
            for (int j = 0; j < size; j++) {
                if (i == j || i == size / 2 || j == size / 2 || j + 1 == size - i) {
                    symbol = "*";
                } else {
                    symbol = ".";
                }
                matrix[i][j] = symbol;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}