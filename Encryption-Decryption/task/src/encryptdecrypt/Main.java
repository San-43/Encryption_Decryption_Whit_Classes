package encryptdecrypt;

import encryptdecrypt.algorithm.Algorithm;
import encryptdecrypt.impl.Controller;
import encryptdecrypt.impl.Strategy;
import encryptdecrypt.resourceUtils.IOhandler;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(args);
        IOhandler ioHandler = new IOhandler(controller.getData(), controller.getInFile(), controller.getOutFile());
        Algorithm algorithm = controller.getAlgorithm();
        Strategy strategy = new Strategy(algorithm);
        String data = strategy.execute(controller.getMode(), ioHandler.getDataTP(), controller.getKey());
        ioHandler.postData(data);
    }
}