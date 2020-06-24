import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lines = "";
        int columns = 0;
        int rows = 0;
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            rows++;
            lines += row + "/";
        }
        String[] arrays = lines.split("/");
        int[][] inMatrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            String[] line = arrays[i].split(" ");
            columns = line.length;
            inMatrix[i] = new int[columns];
            for (int j = 0; j < columns; j++) {
               inMatrix[i][j] = Integer.parseInt(line[j]);
            }
        }
        int[][] outMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                outMatrix[i][j] = inMatrix[i][(j + 1) < columns ? j + 1 : 0]
                        + inMatrix[i][(j - 1) < 0 ? columns - 1 : j - 1]
                        + inMatrix[(i - 1) < 0 ? rows - 1 : i - 1][j]
                        + inMatrix[(i + 1) < rows ? i + 1 : 0][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(outMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}