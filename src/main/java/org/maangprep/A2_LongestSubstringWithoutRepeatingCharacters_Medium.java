package org.maangprep;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class A2_LongestSubstringWithoutRepeatingCharacters_Medium {
    public int lengthOfLongestSubstring(String s) {
        int startIndex = 0;
        String maxSub = "";

        Map<String, Integer> map = new HashMap<>();
        String[] sar = s.toLowerCase().split("");

        for(int i = 0; i < sar.length; i++) {
            Integer indexOfRepChar = map.get(sar[i]);

            if (indexOfRepChar != null && indexOfRepChar >= startIndex) {
                String sub = s.substring(startIndex, i);
                if(sub.length() > maxSub.length()) maxSub = sub;
                startIndex = indexOfRepChar + 1;

            }
            map.put(sar[i], i);
            indexOfRepChar = null;
        }
        return maxSub.length();
    }

    public static void main(String[] args) {
        System.out.println(new A2_LongestSubstringWithoutRepeatingCharacters_Medium().lengthOfLongestSubstring("a"));
    }
}
