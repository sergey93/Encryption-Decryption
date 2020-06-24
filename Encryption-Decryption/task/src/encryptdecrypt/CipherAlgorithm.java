package encryptdecrypt;

interface CipherAlgorithm {

    String encryption(String data, int key);

    String decryption(String data, int key);
}
