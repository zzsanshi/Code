package 剑指Offer;

public class _66构建乘积数组 {
    public int[] constructArr(int[] a) {
        int n = a.length;
        if (n == 0) {
            return new int[0];
        }
        int[] res = new int[n];
        int[] temp = new int[n];
        temp[0] = 1;
        for (int i = 1; i < n; i++) {
            temp[i] = temp[i - 1] * a[i - 1];
        }
        int t = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = t * temp[i];
            t *= a[i];
        }
        return res;


    }
}
