package 贪心;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _455分发饼干 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int num = 0;
        int numOfChildren = g.length, numOfCookies = s.length;
        for (int i = 0, j = 0; i < numOfChildren && j < numOfCookies; i++, j++) {
            while (g[i] > s[j] && j < numOfCookies) {
                j++;
            }
            if (j < numOfCookies) {
                num++;
            }
        }
        return num;
    }
}
