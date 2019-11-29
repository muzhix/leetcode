import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    // first commit
    /*
     * public boolean isPalindrome(int x) { if (x < 0) return false; int n = 0;
     * List<Integer> list = new ArrayList(); while (x >= 1) { list.add(x % 10); x /=
     * 10; n++; } for (int i = 0; i < n / 2; i++) { if (list.get(i) != list.get(n -
     * i - 1)) return false; } return true; }
     */

    // second commit
    /*
     * public boolean isPalindrome(int x) { if (x < 0) return false; int n = 0;
     * int[] list = new int[10]; while (x >= 1) { list[n] = x % 10; x /= 10; n++; }
     * for (int i = 0; i < n / 2; i++) { if (list[i] != list[n - i - 1]) return
     * false; } return true; }
     */

    // third commit
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int halfRev = 0;
        while (x > halfRev) {
            halfRev = halfRev * 10 + x % 10;
            x /= 10;
        }
        return x == halfRev || x == halfRev / 10;
    }
}
// @lc code=end
