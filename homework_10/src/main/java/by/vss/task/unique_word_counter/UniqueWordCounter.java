package by.vss.task.unique_word_counter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    public  final Logger logger = LogManager.getLogger(UniqueWordCounter.class);
    private Map<String, Integer> map;

    public UniqueWordCounter() {
        map = new HashMap<>();
    }

    void addWord(String word) {
        Integer num = map.get(word);
        map.put(word, num == null ? 1 : num + 1);
    }

    String getMostFrequentWord() {
        String word = "";
        Integer num = 0;
        for (Map.Entry<String, Integer> me : map.entrySet()) {
            if (me.getValue() > num) {
                num = me.getValue();
                word = me.getKey();
            }
        }return word;
    }

    void printWordsFrequency() {
        for (Map.Entry<String, Integer> me : map.entrySet()) {
            logger.info("Word : {}, frequency : {}",me.getKey(), me.getValue());
        }
    }

    public Map<String, Integer> getMap() {
        return map;
    }
}
