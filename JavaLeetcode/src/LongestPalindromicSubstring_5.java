// https://leetcode.com/problems/longest-palindromic-substring/
//
//        Given a string s, return the longest palindromic substring in s.
//
//
//
//        Example 1:
//
//        Input: s = "babad"
//        Output: "bab"
//        Explanation: "aba" is also a valid answer.
//        Example 2:
//
//        Input: s = "cbbd"
//        Output: "bb"


import java.util.HashMap;

public class LongestPalindromicSubstring_5 {

    public String longestPalindrome(String s) {
        String str = "";

        return str;
    }

    public static void main(String[] args) {
        //        Example 1:
//        Input: s = "babad"
//        Output: "bab"
//        Explanation: "aba" is also a valid answer.

//        Example 2:
//        Input: s = "cbbd"
//        Output: "bb"

//        String s = "babad"; // bab
//        String s = "cbbd"; // bb


//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < s.length(); j++) {
//                if (!hm.containsKey(s.charAt(j))) {
//                    hm.put(s.charAt(j), j);
//                } else {
//
//                }
//            }
//        }


        String s = "babad"; // bab
//        String s = "cbbd"; // bab
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
                System.out.println(s.charAt(i));
                str += s.charAt(i);
            }
        }

        System.out.println(str);


    }

}
