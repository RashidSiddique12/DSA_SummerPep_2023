import java.util.*;

public class LongestPalindromicSubstring {
    public static String longestPalindrom(String str) {
        int n = str.length();
        String longest = "";
        String subString = "";
        String revString = "";
        for (int i = 0; i < n; i++) {
            int j = n - 1;
            while (i < j) {
                if (str.charAt(i) == str.charAt(j)) {
                    subString = str.substring(i, j + 1);
                    revString = new StringBuilder(subString).reverse().toString();
                    if (subString.equals(revString) && longest.length() < subString.length()) {
                        longest = subString;
                    }
                }
                j--;
            }
        }

        return longest;

    }

    public static void main(String[] args) {
        String str = "aaaaaabbbaaaaaajrofmrf";
        String res = longestPalindrom(str);
        System.out.println(res);
    }
}
