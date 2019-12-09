import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    // first submit
    /* public int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>(7);
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        char[] cs = s.toCharArray();
        int val = 0;
        for (int i = 0; i < cs.length; i++) {
            int cur = values.get(cs[i]);
            if (i == cs.length - 1) {
                val += cur;
                break;
            }
            int next = values.get(cs[i + 1]);
            if (cur < next) {
                val = val + next - cur;
                i++;
            } else {
                val += cur;
            }
        }
        return val;
    } */

    // second submit
    public int romanToInt(String s) {
        char[] cs = s.toCharArray();
        int val = 0;
        for (int i = 0; i < cs.length; i++) {
            int cur = getVal(cs[i]);
            if (i == cs.length - 1) {
                val += cur;
                break;
            }
            int next = getVal(cs[i + 1]);
            if (cur < next) {
                val = val + next - cur;
                i++;
            } else {
                val += cur;
            }
        }
        return val;
    }

    public int getVal(char c) {
        switch (c) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return 0;
        }
    }
}
// @lc code=end
