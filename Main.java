import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        boolean s = m.isPalindrome(7);
        System.out.println(s);

    }

    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int halfRev = 0;
        while (x >= 1) {
            int tx = x;
            int t = x % 10;
            x /= 10;
            halfRev = halfRev * 10 + t;
            if (halfRev == x || halfRev == tx) {
                return true;
            }
            if (halfRev > x) {
                return false;
            }
        }
        return false;
    }
}