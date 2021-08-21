package 剑指Offer;

public class _15二进制中1的个数 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
           res += n&1;
           n >>>=1;
        }
        return res;
    }

    public int hammingWeight1(int n) {
        int res = 0;
        while (n != 0) {
            res ++;
            n &= n-1;
        }
        return res;
    }
}
