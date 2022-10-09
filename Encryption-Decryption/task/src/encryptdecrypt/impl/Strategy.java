package encryptdecrypt.impl;

import encryptdecrypt.algorithm.Algorithm;

public class Strategy {
    private Algorithm algorithm;
    public Strategy(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public String execute(String mode, String data, int key) {
        return switch (mode) {
            case "dec" -> algorithm.decrypt(data, key);
            default -> algorithm.encrypt(data, key);
        };
    }
}
