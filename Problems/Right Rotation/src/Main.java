import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int size = array.length;
        int rotation = scanner.nextInt() % size;
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            int newIndex = (i + rotation) % size;
            newArray[newIndex] = Integer.parseInt(array[i]);
        }
        for (int i = 0; i < size; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
