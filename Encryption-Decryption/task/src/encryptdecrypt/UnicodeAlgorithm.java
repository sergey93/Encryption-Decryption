package encryptdecrypt;

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
