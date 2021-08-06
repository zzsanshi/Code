package 笔试.爱奇艺笔试.第一场2018;

import java.util.LinkedList;
import java.util.Scanner;

public class _括号匹配深度 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String s = cin.nextLine();
            int res = 0;
            int left = 0;
            int left_max = 0;
            LinkedList<Character> stack = new LinkedList<>();
            for (Character c : s.toCharArray()) {
                if (c == '(') {
                    left++;
                    left_max = Math.max(left, left_max);
                    stack.addLast(c);
                } else {
                    stack.removeLast();
                    left--;
                }
            }
            System.out.println(left_max);
        }
    }
}
