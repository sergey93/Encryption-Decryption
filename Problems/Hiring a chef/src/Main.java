//put imports you need here

import java.util.Scanner;
import java.util.SortedMap;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        int age = scanner.nextInt();
        String edu = scanner.next();
        int exp = scanner.nextInt();
        String cp = scanner.next();
        System.out.println("The form for " + firstName + " is completed. We will contact you if we need a chef that cooks " + cp + " dishes.");
    }
}