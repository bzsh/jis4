package by.vss.task.unique_word_vocabulary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    public final Logger logger = LogManager.getLogger(UniqueWordVocabulary.class);
    private final Set<String> set;

    public UniqueWordVocabulary() {
        set = new HashSet<>();
    }

    public void addWord(String word) {
        set.add(word);
    }

    public int getWordsCount() {
        return set.size();
    }

    public void printVocabulary() {
        for (String str : set) {
            logger.info(str);
        }
    }
}