package encryptdecrypt.algorithm;

public class Unicode implements Algorithm {
    @Override
    public String encrypt(String data, int key) {
        StringBuilder encodedText = new StringBuilder();
        data.chars()
                .mapToObj(character -> (char) (character + key))
                .forEach(encodedText::append);
        return encodedText.toString();
    }

    @Override
    public String decrypt(String data, int key) {
        return encrypt(data, -key);
    }
}
