package encryptdecrypt;

import java.io.*;
import java.util.Scanner;

interface CipherAlgorithm {
    String encryption(String data, int key);

    String decryption(String data, int key);
}

class ShiftAlgorithm implements CipherAlgorithm {

    public String encryption(String data, int key) {
        char[] chars = data.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                char newChar = (char) ((chars[i] - 'a' + key) % 26 + 'a');
                chars[i] = newChar;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                char newChar = (char) ((chars[i] - 'A' + key) % 26 + 'A');
                chars[i] = newChar;
            }
        }
        return new String(chars);
    }

    public String decryption(String data, int key) {
        char[] chars = data.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                int code = (chars[i] - 'a' - key) % 26;
                char newChar = (char) ((code < 0) ? code + 'z' + 1 : code + 'a');
                chars[i] = newChar;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                int code = (chars[i] - 'A' - key) % 26;
                char newChar = (char) ((code < 0) ? code + 'Z' + 1 : code + 'a');
                chars[i] = newChar;
            }
        }
        return new String(chars);
    }
}

class UnicodeAlgorithm implements CipherAlgorithm {

    public String encryption(String data, int key) {
        char[] chars = data.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + key);
        }
        return new String(chars);
    }

    public String decryption(String data, int key) {
        char[] chars = data.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - key);
        }
        return new String(chars);
    }
}

class Cryptographer {
    private CipherAlgorithm algorithm;

    public void setAlgorithm(CipherAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public String getEncryptedData(String data, int key) {
        return algorithm.encryption(data, key);
    }

    public String getDecryptedData(String data, int key) {
        return algorithm.decryption(data, key);
    }
}

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
        String text = "";
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                text += scanner.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + filename);
        }
        return text;
    }
}
