package 贪心;

import java.util.Arrays;

public class _1005K次取反后最大化的数组和 {
    public int largestSumAfterKNegations(int[] A, int K) {
        int ans = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length ; i++) {
            if (A[i] < 0 && K >0) {
                A[i] = -A[i];
                K--;
            }
            ans += A[i];
        }
        Arrays.sort(A);
        if (K % 2 == 1) {
            A[0] = -A[0];
            ans -= 2*A[0];
        }
        return ans;
    }
}
