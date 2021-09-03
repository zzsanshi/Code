package 每日一题;
//差分数组
//差分数组得前缀和等于原数组
public class _1109航班预订统计 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        for (int[] book : bookings
        ) {
            res[book[0] - 1] += book[2];
            if (book[1] < n) {
                res[book[1]] -= book[2];
            }

        }
        for (int i = 1; i < res.length; i++) {
            res[i] += res[i - 1];
        }
        return res;
    }
}
