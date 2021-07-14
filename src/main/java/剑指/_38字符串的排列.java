package 剑指;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _38字符串的排列 {
    Set<String> res = new HashSet<>();
    String path ="";
    public String[] permutation(String s) {
        boolean[] used = new boolean[s.length()];
        char[] c = s.toCharArray();
        backtracking(c,used, path);
        return res.toArray(new String[res.size()]);
    }
    void backtracking(char[] c,boolean[] used, String path) {
        if(path.length() == c.length) {
            res.add(path.toString());
            return;
        }
        for (int i = 0; i < c.length; i++) {
            if (used[i] == true) {
                continue;
            }
            used[i] = true;

            backtracking(c,used,path+c[i]);

            used[i] = false;
        }
    }
}
