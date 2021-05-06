package 贪心;

public class _134加油站 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0;
        int sum = 0;
        int start = 0;
        for (int i = 0; i <gas.length ; i++) {
            curSum += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if (curSum < 0) {
                start = i+1;
                curSum = 0;
            }
        }
        if (sum < 0) {
            return  -1;
        }
        return start;

    }

}
