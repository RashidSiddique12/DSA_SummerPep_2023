public class Basic {

    public static void main(String[] args) {
        // String s1 = "Rashid";
        // String s2 = "Siddique";
        // String temp = s1;
        // s1 = s2;
        // s2 = temp;
        // System.out.println("s1 : " + s1 + " s2 : " + s2);
        // char s1Array[] = s1.toCharArray();
        // char s2Array[] = s2.toCharArray();
        // for (int i = 0; i < s1Array.length; i++) {
        // System.out.print(s1Array[i]);
        // }
        // System.out.println();
        // for (int i = 0; i < s2Array.length; i++) {
        // System.out.print(s2Array[i]);
        // }

        // for (int i = 0; i < s1.length(); i++) {
        // System.out.print(s1.charAt(i));
        // }
        // System.out.println();
        // for (int i = 0; i < s2.length(); i++) {
        // System.out.print(s2.charAt(i));
        // }

        // StringBuilder s = new StringBuilder("How are you");

        // int n = s.length();
        // for (int i = 0; i < n; i++) {
        // if (s.charAt(i) != ' ') {
        // s.append(s.charAt(i));
        // }
        // }

        // System.out.println(s);

        String str = "How   are  you";
        // int count = 0;
        // for (int i = 0; i < s.length(); i++) {
        // if(s.charAt(i) == ' '){
        // if()
        // }
        // }

        int wc = 0; // word count
        int i = 0;

        // Scan all characters one by one
        while (i < str.length()) {
            // If next character is a separator, set the
            // state as OUT
            if (str.charAt(i) == ' ' || str.charAt(i) == '\n'
                    || str.charAt(i) == '\t') {

            }

            else {

                ++wc;
            }

            ++i;
        }
        System.out.println(wc);

    }
}
