public class ReverseStringWord {
    public static void main(String[] args) {

        // String str = "How are you";
        // String word[] = str.split("\\s+");
        // StringBuilder newString = new StringBuilder();
        // for (int i = word.length - 1; i >= 0; i--) {
        // newString.append(word[i]);
        // if (i > 0) {
        // newString.append(" ");
        // }
        // }

        // System.out.println(newString.toString());

        String str = "How are you everyone";
        String ans = "";
        int n = str.length();
        int i = 0;

        while (i < n) {
            while (i < n && str.charAt(i) == ' ') {
                i++;
            }
            int j = i + 1;
            while (j < n && str.charAt(j) != ' ') {
                j++;
            }

            String smallans = str.substring(i, j);
            if(char ch : )

            if (ans.length() == 0) {
                ans = smallans;
            } else {
                ans = smallans + " " + ans;
            }
            i = j;
        }
        System.out.println(ans);

    }

}

/////////////////
// Online C++ compiler to run C++ program online
// #include <iostream>

// using namespace std;
// string rw(string str){
// string ans;
// int i=0;
// int n = str.length();
// while(i < n){
// while(i<n && str[i]==' '){i++;}
// if(i>=n){break;}
// int j = i+1;
// while(j<n && str[j]!=' '){
// j++;
// }
// string sa = str.substr(i,j-i);
// string ssa="";
// for(auto ch:sa){
// ssa = ch+ssa;
// }
// if(ans.length() == 0){ans = ssa;}
// else{ ans = ans+' '+ssa;}
// i = j;
// }
// return ans;
// }
// int main() {
// string s = "how are you"; // ouy era woh
// string ans = rw(s);
// cout<<ans;

// return 0;
// }
