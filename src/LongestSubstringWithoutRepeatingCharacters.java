import java.util.HashMap;
import java.util.Stack;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Boolean> dict = new HashMap<>();
        int largest = 0, count = 0;

        if (s.length() <= 1) return s.length();

        for (int i = 0; i < s.length(); i++) {
            if (largest > s.length() - i) break;
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (dict.containsKey(c)) {
                    if (largest < count) largest = count;
                    dict.clear();
                    count = 0;
                    break;
                }
                dict.put(c, true);
                count += 1;
            }
            if (largest < count) largest = count;
        }

        return largest;
    }

    public static void main(String... args) {
        //abcabcbb
        //bbbbb
        //pwwkew
        //au
        //dvdf
        String input = "abcabcbb";
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        int count = solution.lengthOfLongestSubstring(input);
        System.out.print(count);
    }
}
