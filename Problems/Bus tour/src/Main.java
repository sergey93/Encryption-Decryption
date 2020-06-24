import java.util.*;

class BusTour {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int heightOfBus = scanner.nextInt();
        int n = scanner.nextInt();
        int bridgeNumber = 0;
        for(int i = 0; i < n; i++) {
            int heightOfBridge = scanner.nextInt();
            if (heightOfBridge <= heightOfBus) {
                bridgeNumber = i + 1;
                break;
            }
        }
        if (bridgeNumber > 0) {
            System.out.println("Will crash on bridge " + bridgeNumber);
        } else {
            System.out.println("Will not crash");
        }

    }
}