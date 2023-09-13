
import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> found = new HashSet<>(); 
        int maxLen = Integer.MIN_VALUE;
        int start = 0;

        if (s.length() < 2)
            return s.length();

        for (int end = 0; end < s.length(); end++) {
            if (found.contains(s.charAt(end))  ) {
                while(s.charAt(start) != s.charAt(end)) {
                    found.remove(s.charAt(start));
                    start++;
                }
                start++;
            } else {
                found.add(s.charAt(end)) ;
                maxLen = Math.max(maxLen, end - start + 1);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Longest_Substring_Without_Repeating_Characters l = new Longest_Substring_Without_Repeating_Characters();
        System.out.println(l.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(l.lengthOfLongestSubstring("bbbbb"));
        System.out.println(l.lengthOfLongestSubstring("pwwkew"));
        System.out.println(l.lengthOfLongestSubstring("dvdf"));
        System.out.println(l.lengthOfLongestSubstring("abba"));
        System.out.println(l.lengthOfLongestSubstring("tmmzuxt"));
    }

}
