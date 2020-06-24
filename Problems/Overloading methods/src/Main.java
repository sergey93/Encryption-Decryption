import java.util.Scanner;

public class Main {

    public static long getMaxMinusCurrent(long val) {
        return Long.MAX_VALUE - val;
    }

    public static int getMaxMinusCurrent(int val) {
        return Integer.MAX_VALUE - val;
    }

    public static short getMaxMinusCurrent(short val) {
        return (short) (Short.MAX_VALUE - val);
    }

    // Do not change code below

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        switch (type) {
            case "long":
                final long longVal = Long.parseLong(scanner.nextLine());
                final long longResult = getMaxMinusCurrent(longVal);
                System.out.println(longResult);
                break;
            case "int":
                final int intVal = Integer.parseInt(scanner.nextLine());
                final int intResult = getMaxMinusCurrent(intVal);
                System.out.println(intResult);
                break;
            case "short":
                final short shortVal = Short.parseShort(scanner.nextLine());
                final short shortResult = getMaxMinusCurrent(shortVal);
                System.out.println(shortResult);
                break;
            default:
                System.out.println("Unknown type found");
                break;
        }
    }
}

class Test {

    public static void main(String args[]) {

        Person person = new Person("R. Johnson");

        System.out.println(person.getNextId()); // (1)
    }
}

class Person {

    private static long nextId = 1;

    long id;
    String name;

    public Person(String name) {
        name = name; // (2)
        this.id = nextId;
        this.nextId++; // (3)
    }

    public static long getNextId() { // (4)
        return nextId;
    }
}