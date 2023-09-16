
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

   

}
