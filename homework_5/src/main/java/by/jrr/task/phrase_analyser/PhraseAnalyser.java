package by.jrr.task.phrase_analyser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PhraseAnalyser {
    public static final Logger LOGGER = LogManager.getLogger(PhraseAnalyser.class);
    private PhraseAnalyser() {
    }

    public static String analyze(String phrase) {
        LOGGER.info("Method analyze has been called");
        final String MAKE = "Make";
        final String GREAT_AGAIN = "great again";
        boolean hasTwoOptions = phrase.startsWith(MAKE) && phrase.endsWith(GREAT_AGAIN);
        boolean hasOneOptionAtLeast = phrase.startsWith(MAKE) || phrase.endsWith(GREAT_AGAIN);

        if (hasTwoOptions) {
            return "It stands no chance";
        } else if (hasOneOptionAtLeast) {
            return "It could be worse";
        }
        return "It is fine, really";
    }
}
