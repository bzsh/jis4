package by.vss.task.palindrome;

public class Palindrome {

    public boolean isPalindrome(String text) {
        String temp = text.replaceAll("[\\W^ ]", "");
        char[] arr = temp.toCharArray();
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
