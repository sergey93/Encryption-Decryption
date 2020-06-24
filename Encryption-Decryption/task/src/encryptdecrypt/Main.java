package encryptdecrypt;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String operation = "enc";
        String alg = "shift";
        String data = "";
        String in = "";
        String out = "";
        String outData = "";

        int key = 0;
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode":
                    operation = args[i + 1];
                    break;
                case "-data":
                    data = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-in":
                    in = args[i + 1];
                    break;
                case "-out":
                    out = args[i + 1];
                    break;
                case "-alg":
                    alg = args[i + 1];
                    break;
            }
        }

        if (data.isEmpty()) {
            data = readDataFromFile(in);
        }

        Cryptographer cryptographer = new Cryptographer();
        switch (alg) {
            case "unicode":
                cryptographer.setAlgorithm(new UnicodeAlgorithm());
                break;
            case "shift":
                cryptographer.setAlgorithm(new ShiftAlgorithm());
                break;
        }

        switch (operation) {
            case "enc":
                outData = cryptographer.getEncryptedData(data, key);
                break;
            case "dec":
                outData = cryptographer.getDecryptedData(data, key);
                break;
            default:
                System.out.println("Unknown operator.");
        }

        if (out.isEmpty()) {
            System.out.println(outData);
        } else {
            writeDataInfile(outData, out);
        }

    }

    public static void writeDataInfile(String data, String filename) {
        File file = new File(filename);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(data);
        } catch (IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }
    }

    public static String readDataFromFile(String filename) {
        File file = new File(filename);
        String data = "";
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                data += scanner.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + filename);
        }
        return data;
    }
}
