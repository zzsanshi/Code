package 代码回想录;

import java.util.*;

public class _347前k个高频词 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet()); //将map的entryset放入list集合
        //对list进行排序，并通过Comparator传入自定义的排序规则
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue(); //重写排序规则，小于0表示升序，大于0表示降序
            }
        });
        int[] its = new int[k];
        int i = 0;
        Iterator<Map.Entry<Integer, Integer>> iter = list.iterator();
        while (i < k) {
            Map.Entry<Integer, Integer> item = iter.next();
            int key = item.getKey();
            int value = item.getValue();
            its[i++] = key;
        }
        return its;
    }
}
