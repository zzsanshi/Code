package 每日一题;

public class _443压缩字符串 {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n == 1) {
            return 1;
        }
        int read = 0, write = 0;
        int left = 0;//第一个字符
        for (read = 0; read < n; read++) {
            if (read == n - 1 || chars[read] != chars[read + 1]) {
                chars[write++] = chars[read];
                //计算数量;
                int num = read - left + 1;
                if (num > 1) {
                    int temp = write;
                    while (num != 0) {
                        chars[write++] = (char) (num % 10);
                        num /= 10;
                    }
                    reverse(chars, temp, write - 1);
                }
                left = read + 1;
            }
        }
        return write;
    }
    void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
