package leecode热门100题;

public class _739每日温度 {
    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures.length == 0) {
            return new int[0];
        }
        int[] dp = new int[temperatures.length];
        dp[temperatures.length - 1] = 0;

        for (int i = temperatures.length - 2; i >= 0; i--) {
                for (int j = i + 1; j < temperatures.length ; j++) {
                    if (temperatures[i] < temperatures[j]) {
                        dp[i] = j - i;
                        break;
                    } else if (dp[j] == 0) {
                        break;
                    }
            }
        }
        return dp;
    }
}
