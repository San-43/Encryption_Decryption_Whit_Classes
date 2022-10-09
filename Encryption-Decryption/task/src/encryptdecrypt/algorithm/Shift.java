package encryptdecrypt.algorithm;

public class Shift implements Algorithm {
    @Override
    public String encrypt(String data, int key) {
        StringBuilder cipherText = new StringBuilder();
        data.chars()
                .mapToObj(character -> character == ' ' ? ' ' : getShifted((char) character, key))
                .forEach(cipherText::append);
        return cipherText.toString();
    }

    @Override
    public String decrypt(String data, int key) {
        return encrypt(data, (26 - (key % 26)));
    }

    private Character getShifted(Character character, int key) {
        int position = character - 'a';
        int finalPosition = (position + key) % 26;
        return (char) ('a' + finalPosition);
    }
}
