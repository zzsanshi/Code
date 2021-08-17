package 笔试.携程春招.秋招2019;

import java.util.*;

public class _查询满足区间的记录 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int A = cin.nextInt();
            cin.nextLine();
            int[][] orders = new int[n][3];
            for (int i = 0; i < n; i++) {
                String[] s = cin.nextLine().split(" ");
                orders[i][0] = Integer.valueOf(s[0]);
                orders[i][1] = Integer.valueOf(s[1]);
                orders[i][2] = Integer.valueOf(s[2]);
            }

            int left = 0, right = n - 1;
            int mid = 0;
            Arrays.sort(orders, new Comparator<int[]>() {
                        @Override
                        public int compare(int[] o1, int[] o2) {
                            if (o1[1] == o2[1]) {
                                return o1[2] - o2[2];
                            }
                            return o1[1] - o2[1];
                        }
                    }
            );
            ArrayList<Integer> res = new ArrayList<>();
            getRes(res, orders, A, 0, orders.length - 1);
            Collections.sort(res);
            if(res.isEmpty()) {
                System.out.println("null");
            } else {
                for(Integer i :res) {
                    System.out.println(i);
                }
            }

        }
    }
    private static void getRes(List<Integer> res, int[][] nums, int target, int l, int h) {
        if (l > h) return;
        int mid = l + (h - l) / 2;
        if (nums[mid][1] <= target && nums[mid][2] >= target) {
            res.add(nums[mid][0]);
        }
        getRes(res, nums, target, l, mid - 1);
        getRes(res, nums, target, mid + 1, h);
    }
}
