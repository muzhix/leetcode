import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    // first submit
    /* public String longestCommonPrefix(String[] strs) {
        if (strs.length <= 0)
            return "";
        String maxPrex = strs[0];
        for (String s : strs) {
            maxPrex = getCommon(maxPrex, s);
            if ("".equals(maxPrex)) {
                break;
            }
        }
        return maxPrex;
    }

    public String getCommon(String s1, String s2) {
        String shortStr, longStr, common;
        if (s1.length() == 0 || s2.length() == 0)
            return "";
        if (s1.length() <= s2.length()) {
            shortStr = s1;
            longStr = s2;
        } else {
            shortStr = s2;
            longStr = s1;
        }
        ;
        common = shortStr;
        for (int i = common.length(); i > 0; i--) {
            if (common.equals(longStr.substring(0, i))) {
                return common;
            } else {
                common = common.substring(0, i - 1);
            }
        }
        return "";
    } */

    // second submit, its bad
    /* public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        Arrays.sort(strs, (a, b) -> a.compareTo(b));
        return getCommon(strs[0], strs[strs.length - 1]);
    }

    public String getCommon(String s1, String s2) {
        String shortStr, longStr, common;
        if (s1.length() == 0 || s2.length() == 0)
            return "";
        if (s1.length() <= s2.length()) {
            shortStr = s1;
            longStr = s2;
        } else {
            shortStr = s2;
            longStr = s1;
        }
        ;
        common = shortStr;
        for (int i = common.length(); i > 0; i--) {
            if (common.equals(longStr.substring(0, i))) {
                return common;
            } else {
                common = common.substring(0, i - 1);
            }
        }
        return "";
    } */

    // third submit
    public String longestCommonPrefix(String[] strs) {
        if (strs.length <= 0)
            return "";
        StringBuilder sb = new StringBuilder();
        String base = strs[0];
        for (int i = 0; i < base.length(); i++) {
            char c = base.charAt(i);
            for (String s : strs) {
                try {
                    if (c != s.charAt(i)) {
                        return sb.toString();
                    }
                } catch (StringIndexOutOfBoundsException e) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
// @lc code=end
