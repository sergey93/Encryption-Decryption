package encryptdecrypt;

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
