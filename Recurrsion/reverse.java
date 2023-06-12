// package Recurrsion;

public class reverse {

    public static String reverse(String str) {
        char[] charArray = str.toCharArray();
        int lo = 0;
        int h = str.length() - 1;
        while (lo < h) {
            char temp = charArray[lo];
            charArray[lo] = charArray[h];
            charArray[h] = temp;
            lo++;
            h--;
        }

        return new String(charArray);

    }

    public static void main(String[] args) {
        String str = "cipher school";
        System.out.println(str);
        System.out.println("Normal way : " + reverse(str));
    }

}
