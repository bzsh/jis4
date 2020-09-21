package by.vss.task.palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void isPalindromeShouldReturnTrue() {
        var p = new Palindrome();
        String test = "q/we rt,yt!r.ew;q";
        assertTrue(p.isPalindrome(test));
    }

    @Test
    public void isPalindromeShouldReturnFalse() {
        var p = new Palindrome();
        String test = "qwe5rt ytrewq";
        assertFalse(p.isPalindrome(test));
    }


}