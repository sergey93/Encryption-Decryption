import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean ascending = true;
        boolean descending = true;
        int previous = scanner.nextInt();
        int current = (previous == 0) ? 0 : scanner.nextInt();
        while (current != 0) {
            if (current < previous && ascending) {
                ascending = false;
            }
            if (current > previous && descending) {
                descending = false;
            }
            if (!(ascending || descending)) {
                break;
            }
            previous = current;
            current = scanner.nextInt();
        }
        System.out.println(descending || ascending);
    }
}