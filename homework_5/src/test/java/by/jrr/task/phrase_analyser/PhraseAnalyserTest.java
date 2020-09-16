package by.jrr.task.phrase_analyser;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhraseAnalyserTest {
    @Test
    public void analyzeShouldReturnStringWithNoChance() {
        String phrase = "Make app great again";
        String expected = "It stands no chance";
        String actual = PhraseAnalyser.analyze(phrase);
        assertEquals(expected, actual);
    }

    @Test
    public void analyzeShouldReturnStringWithWorthCaseOne() {
        String phrase = "Make app great again f";
        String expected = "It could be worse";
        String actual = PhraseAnalyser.analyze(phrase);
        assertEquals(expected, actual);
    }

    @Test
    public void analyzeShouldReturnStringWithWorthCaseTwo() {
        String phrase = "f Make app great again";
        String expected = "It could be worse";
        String actual = PhraseAnalyser.analyze(phrase);
        assertEquals(expected, actual);
    }

    @Test
    public void analyzeShouldReturnStringWithFine() {
        String phrase = "App great again make";
        String expected = "It is fine, really";
        String actual = PhraseAnalyser.analyze(phrase);
        assertEquals(expected, actual);
    }
}