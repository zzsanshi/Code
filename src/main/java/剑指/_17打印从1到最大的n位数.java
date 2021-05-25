package 剑指;

public class _17打印从1到最大的n位数 {
    public int[] printNumbers(int n) {
        int end = (int)Math.pow(10, n) - 1;
        int[] res = new int[end];
        for (int i = 0; i < res.length; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
