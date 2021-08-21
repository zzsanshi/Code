package 剑指Offer;

import java.util.ArrayList;
import java.util.Collections;

public class _46把数字翻译成字符串 {
    public int translateNum(int num) {
        if(num <10) {
            return 1;
        }
        ArrayList<Integer> n = new ArrayList<>();
        while (num != 0) {
            n.add(num % 10);
            num /= 10;
        }
        Collections.reverse(n);
        int[] dp = new int[n.size()+1];
        dp[0] =1;
        dp[1] =1;
        for (int i = 2; i < n.size()+1; i++) {
            int mul = n.get(i-1) + n.get(i-2)*10;
            if(mul > 25 || mul <10) {
                dp[i] = dp[i-1];
            } else {
                dp[i] = dp[i-1] +dp[i-2];
            }
        }
        return dp[n.size()];
    }
}
