package by.jrr.task.encoder.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Encoder {
    public static final Logger LOGGER = LogManager.getLogger(Encoder.class);
    
    private Encoder(){}
    
    public static void encode(short symbolCode) {
        LOGGER.info("Encoder encode method has been called !");
        char symbol = (char) symbolCode;
        System.out.println("The symbol of code " + symbolCode + " is '" + symbol + "'");
    }

    public static void decode(char symbol) {
        LOGGER.info("Encoder decode method has been called !");
        short symbolCode = (short) symbol;
        System.out.println("The code of symbol '" + symbol + "' is " + symbolCode);
    }
}
