import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] str = scanner.nextLine().toCharArray();
        int result = 0;
        for (char ch : str) {
            result += Character.getNumericValue(ch);
        }
        System.out.println(result);
    }
}