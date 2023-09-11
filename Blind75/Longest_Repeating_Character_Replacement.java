public class Longest_Repeating_Character_Replacement {

    public int characterReplacement(String s, int k) {

        int[] count = new int[26];
        int maxCount = Integer.MIN_VALUE;
        int maxLen = Integer.MIN_VALUE;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            count[s.charAt(end) - 'A']++;
            int windowSize = end - start + 1;
            maxCount = Math.max(maxCount, count[s.charAt(end) - 'A']);
            if (windowSize - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }else{
                maxLen = Math.max(maxLen, windowSize);
            }

        }
        return maxLen;
    }

}
