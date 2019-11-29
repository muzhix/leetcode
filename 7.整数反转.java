/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {

    // first submit
    /* public int reverse(int x) {
        int abs = Math.abs(x);
        if (abs == Integer.MIN_VALUE) {
            return 0;
        }
        String str = String.valueOf(abs);
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
        String r = String.valueOf(s);
        long l = Long.valueOf(r);
        int value = l > Integer.MAX_VALUE ? 0 : (int) l;
        return x > 0 ? value : -value;
    } */


    public int reverse(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    
}
// @lc code=end
