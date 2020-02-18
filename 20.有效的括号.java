import java.util.ArrayDeque;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        if (s.length() == 0)
            return true;

        final String check = "([{}])";
        char[] chars = s.toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        int before = check.indexOf(chars[0]);
        int now = 0;
        stack.push(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            now = check.indexOf(chars[i]);
            int sum = before + now;

            if (sum == 5) {
                stack.pop();
                if(stack.peek() != null){
                    before = check.indexOf(stack.peek());
                }
            } else if (now > 2) {
                return false;
            } else {
                stack.push(chars[i]);
                before = now;
            }
        }

        return stack.peekFirst() == null;
    }
}
// @lc code=end

