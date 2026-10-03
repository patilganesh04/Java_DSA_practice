
import java.util.HashMap;

public class Nonrepetedsubstring {

    static boolean Nonrepeat(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                return false;
            }
            map.put(ch, 1);
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                if (Nonrepeat(temp)) {
                    maxLength = Math.max(maxLength, temp.length());
                }
            }
        }

        
    }
}
