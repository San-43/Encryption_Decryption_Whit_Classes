package encryptdecrypt.algorithm;

public interface Algorithm {
    String encrypt(String data, int key);
    String decrypt(String data, int key);
}
