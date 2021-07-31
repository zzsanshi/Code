package 代码回想录.回溯;

import java.util.ArrayList;
import java.util.List;

public class _131分割回文串 {
    List<List<String>> res = new ArrayList<>();
    List<String> path = new ArrayList<>();
    public List<List<String>> partition(String s) {
            backtracking(s,0);
            return res;
    }
    void backtracking(String s,int startIndex) {
        if (startIndex > s.length()-1) {
            res.add(path);
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if(isPalindrome(s, startIndex, i)) {
                String str = s.substring(startIndex,i+1);
                path.add(str);
            }
            else {
                continue;
            }
            backtracking(s,i+1);
            path.remove(path.size()-1);//回溯过程
        }
    }
    Boolean isPalindrome(String s,int start,int end) {
        char[] str = s.toCharArray();
        for (int i = start, j = end; i <j; i++,j++) {
            if (str[i] != str[j]) {
                return false;
            }
        }
        return true;
    }
}
