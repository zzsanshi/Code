package 剑指Offer;
//位运算
public class _56数组中数字出现的次数II {
    public int singleNumber(int[] nums) {
        int[] count = new int[32];
        for (int num:nums
             ) {
            for (int i = 0; i < 32; i++) {
                count[i] +=num & 1;
                num >>>= 1;
            }
        }
        int res = 0, m = 3;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res |= count[31 -i] % m;
        }
        return res;
    }
}
