import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sequence = new int[scanner.nextInt()];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == num) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}