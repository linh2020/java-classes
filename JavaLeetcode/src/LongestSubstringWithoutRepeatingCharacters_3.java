//import java.util.HashSet;
//
///*
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//* */

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters_3 {

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;

        HashSet<Character> hs = new HashSet();
        while (j < s.length()) {
            if (!hs.contains(s.charAt(j))) {
                hs.add(s.charAt(j));
                j++;
                max = Math.max(hs.size(), max);

                System.out.println("After Add: " + hs + ", max: " + max + ", size: " + hs.size());

            } else {
                hs.remove(s.charAt(i));
                i++;

                System.out.println("\t\tAfter Remove: " + hs + ", max: " + max + ", size: " + hs.size());

            }
        }
        return max;
    }

    public static void main(String[] args) {
//        String str = "aaabcde"; // 5
//        String str = "abcabcbb"; // 3
//        String str = "pwwkew"; // 3
        String str = MyClasses.randomString(6);
//        System.out.println(str);

        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(str);
    }
}


////    After Add: [a]
////    After Add: [a, b]
////    After Add: [a, b, c]
////    After remove: [b, c]
////    After Add: [a, b, c]
////    After remove: [a, c]
////    After Add: [a, b, c]
////    After remove: [a, b]
////    After Add: [a, b, c]
////    After remove: [b, c]
////    After remove: [c]
////    After Add: [b, c]
////    After remove: [b]
////    After remove: []
////    After Add: [b]
//

////------------------------------------------------------------------------------------
//
//import java.util.HashSet;
//
//public class LongestSubstringWithoutRepeatingCharacters_3 {
//
//    public static int lengthOfLongestSubstring(String s) {
//        int max = 0;
//        boolean flag = true;
//        int i = 0;
//        int j = 0;
//
//        HashSet hs = new HashSet();
//        while (i < s.length()) {
//            flag = true;
//            j = i;
//            while (flag && j < s.length()) {
//                if (!hs.contains(s.charAt(j))) {
//                    hs.add(s.charAt(j));
//                    j++;
//
//                    System.out.println(hs);
//
//                    max = Math.max(hs.size(), max);
//                } else {
//                    hs.clear();
//                    flag = false;
//                }
//            }
//            i++;
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        String str = "aaabcde"; // 5
////        String str = "abcabcbb"; // 3
////        String str = "pwwkew"; // 3
//
//        System.out.println(lengthOfLongestSubstring(str));
//    }
//}
//
////        [a]
////        [a]
////        [a]
////        [a, b]
////        [a, b, c]
////        [a, b, c, d]
////        [a, b, c, d, e]
////        [c]
////        [c, d]
////        [c, d, e]
////        [e]
////        5
//
////------------------------------------------------------------------------------------

//import java.util.HashSet;
//public class LongestSubstringWithoutRepeatingCharacters_3 {
//
//    public static int lengthOfLongestSubstring(String s) {
//        int max = 0;
//        int i = 0;
//        int j = 0;
//        HashSet hs = new HashSet();
//
//        while (j < s.length()) {
//            if (!hs.contains(s.charAt(j))) {
//                hs.add(s.charAt(j));
//                j++;
//                max = Math.max(hs.size(), max);
//
//                System.out.println("max: " + max + " => " + hs);
//
//            } else {
//                i++;
//                j = i;
//                hs.clear();
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        String str = "aaabcde"; // 5
////        String str = "abcabcbb"; // 3
////        String str = "pwwkew"; // 3
//
//        System.out.println(lengthOfLongestSubstring(str));
//    }
//}