import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while (scanner.hasNext()) {
            String item = scanner.nextLine();
            if (item.equals("0")) {
                break;
            }
            str += " " + item;
        }
        String[] array = str.trim().split(" ");
        for (String elem : array) {
            try {
                int number = Integer.parseInt(elem);
                System.out.println(number * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + elem);
            }
        }
    }
}