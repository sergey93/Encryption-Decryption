package encryptdecrypt;

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
