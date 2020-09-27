package by.vss.task.unique_word_vocabulary;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class UniqueWordVocabularyTest {
    UniqueWordVocabulary vocabulary;

    @Before
    public void setup() {
        vocabulary = new UniqueWordVocabulary();
    }

    @Test
    public void addWord() {
        int expected = 1;
        vocabulary.addWord("test");
        int actual = vocabulary.getWordsCount();
        assertEquals(expected, actual);
    }

    @Test
    public void getWordsCount() {
        int expected = 1;
        vocabulary.addWord("count");
        int actual = vocabulary.getWordsCount();
        assertEquals(expected, actual);
    }

    @Test
    public void printVocabulary() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        vocabulary.addWord("One");
        vocabulary.addWord("Two");
        vocabulary.addWord("Three");
        vocabulary.printVocabulary();
        String actual = output.toString();
        String expected = actual;
        assertEquals(expected, actual);
    }
}