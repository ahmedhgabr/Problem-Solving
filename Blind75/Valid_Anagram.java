
import java.util.Arrays;
import java.util.HashMap;

public class Valid_Anagram {

    // public boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length())
    //         return false;

    //     char[] sArr = s.toCharArray();
    //     char[] tArr = t.toCharArray();

    //     Arrays.sort(sArr);
    //     Arrays.sort(tArr);
        
    //     return Arrays.equals(sArr, tArr);
    // }


    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c , map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (char c : map.keySet()) {
            if (map.get(c) != 0)
                return false;
        }
        return true;

    }

}