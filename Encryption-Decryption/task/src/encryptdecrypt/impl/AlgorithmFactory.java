package encryptdecrypt.impl;

import encryptdecrypt.algorithm.Algorithm;
import encryptdecrypt.algorithm.Shift;
import encryptdecrypt.algorithm.Unicode;

public class AlgorithmFactory {

    public Algorithm getAlgorithm(String requestedAlgo) {
        return switch (requestedAlgo) {
            case "unicode" -> new Unicode();
            default -> new Shift();
        };
    }
}
