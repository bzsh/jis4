package by.vss.task.unique_word_counter;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UniqueWordCounterTest {
    UniqueWordCounter uwc;

    @Before
    public void setup(){
        uwc = new UniqueWordCounter();
    }

    @Test
    public void addWord() {
        uwc.addWord("potato");
        uwc.addWord("apple");
        uwc.addWord("onion");
        int expected = 3;
        int actual = uwc.getMap().size();
        assertEquals(expected, actual);
    }

    @Test
    public void getMostFrequentWord() {
        uwc.addWord("potato");
        uwc.addWord("apple");
        uwc.addWord("potato");
        String expected = "potato";
        String actual = uwc.getMostFrequentWord();
        assertEquals(expected, actual);
    }

    @Test
    public void printWordsFrequency() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        uwc.addWord("potato");
        uwc.addWord("apple");
        uwc.addWord("onion");
        uwc.printWordsFrequency();
        String actual = output.toString();
        String expected = actual;
        assertEquals(expected, actual);
    }
}