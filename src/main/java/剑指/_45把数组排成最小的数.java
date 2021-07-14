package 剑指;

import java.util.Arrays;

//自定义排序
public class _45把数组排成最小的数 {
    public String minNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        //lamba表达式
        Arrays.sort(str,(x,y)->(x+y).compareTo(y+x));
        StringBuilder res = new StringBuilder();
        for (String s:str
             ) {
            res.append(s);
        }
        return res.toString();
    }
}
