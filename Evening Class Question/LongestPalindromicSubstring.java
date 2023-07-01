import java.util.*;

class LongestPalindromicSubstring {
    public static String longestPalindrom(String s) {
        // Expand from Center
        int n = s.length();
        int start = 0, maxLength = 0;
        for (int i = 0; i < n; i++) {
            int len1 = expandFromCenter(s, i, i); // For Odd Case
            int len2 = expandFromCenter(s, i, i + 1); // For Even Case
            int len = Math.max(len1, len2);

            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + maxLength);
    }

    public static int expandFromCenter(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }

    // Time Limit Exceed

    // public class LongestPalindromicSubstring {
    // public static String longestPalindrom(String str) {
    // int n = str.length();
    // String longest = str.substring(0, 1);
    // String subString = "";
    // String revString = "";
    // if (n == 1)
    // return str;
    // for (int i = 0; i < n; i++) {
    // int j = n - 1;
    // while (i < j) {
    // if (str.charAt(i) == str.charAt(j)) {
    // subString = str.substring(i, j + 1);
    // revString = new StringBuilder(subString).reverse().toString();
    // if (subString.equals(revString) && longest.length() < subString.length()) {
    // longest = subString;
    // }
    // }
    // j--;
    // }
    // }

    // return longest;

    // }

    public static void main(String[] args) {
        String str = "aaaaaabbbaaaaaajrofmrf";
        String res = longestPalindrom(str);
        System.out.println(res);
    }
}
