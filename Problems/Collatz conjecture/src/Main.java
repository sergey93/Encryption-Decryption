import java.util.Scanner;

class Collatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (true) {
            System.out.println(n);
            if (n == 1) {
                break;
            }
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
    }
}