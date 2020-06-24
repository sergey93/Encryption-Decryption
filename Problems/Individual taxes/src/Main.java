import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] incomes = new int[scanner.nextInt()];
        int[] taxes = new int[incomes.length];
        int maxTax = 0;
        int index = 0;
        for (int i = 0; i < incomes.length; i++) {
            incomes[i] = scanner.nextInt();
        }
        for (int i = 0; i < taxes.length; i++) {
            taxes[i] = scanner.nextInt();
        }
        for (int i = 0; i < incomes.length; i++) {
            if (maxTax < incomes[i] * taxes[i]) {
                maxTax = incomes[i] * taxes[i];
                index = i;
            }
        }
        System.out.println(index + 1);
    }
}