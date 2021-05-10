package 剑指;

public class _11旋转数组的最小数字 {
    public int minArray(int[] numbers) {
        int max = numbers[0];
        int inx = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (max <= numbers[i]) {
                max = numbers[i];
            }
            else {
                inx = i;
                break;
            }

        }
        return numbers[inx];
    }
}
