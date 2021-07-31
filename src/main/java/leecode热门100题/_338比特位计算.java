package leecode热门100题;

public class _338比特位计算 {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i = 0; i <= n; i++) {
            int temp = i;
            while (temp!=0) {
                temp&=(temp -1);
                res[i]++;
            }
        }
        return res;
    }
}
