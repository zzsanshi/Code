package 代码回想录.贪心;

import java.util.*;

public class _406根据身高重建队列 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o2[0] - o1[0];
                }
                else {
                    return o1[1] - o2[1];
                }
            }
        });
        List<int[]> ans = new ArrayList<>();
        for (int[] person : people)  {
            int position = person[1];
            ans.add(position, person);
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
