package leecode热门100题;

public class _136只出现一次的数字 {
    //位运算
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
