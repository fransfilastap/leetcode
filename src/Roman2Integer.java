import java.util.HashMap;

public class Roman2Integer {

    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int result = 0;

        for (int i = 0; i < s.length(); ) {
            if (i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result += (map.get(s.charAt(i + 1)) - map.get(s.charAt(i)));
                i += 2;
            } else {
                result += map.get(s.charAt(i));
                i++;
            }
        }

        return result;
    }

}
