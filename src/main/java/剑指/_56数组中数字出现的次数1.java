package 剑指;

import java.util.Arrays;
//使用异或
public class _56数组中数字出现的次数1 {
    public int[] singleNumbers(int[] nums) {
        int x = 0, y = 0;
        int m = 1, n = 0;
        for (int num : nums
        ) {
            n ^= num;
        }
        while ((n & m) == 0) {
            m <<= 1;
        }
        for (int num : nums
        ) {
            if ((num & m) != 0) x ^= num;
            else y ^= num;
        }
        return new int[]{x, y};
    }
}
