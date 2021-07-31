package 代码随想录.回溯;
/**
* Description:
 * 给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。
 *
 * 回文串 是正着读和反着读都一样的字符串。
* date: 2021/7/31 11:23
* @author: zzsanshi
* @since JDK 14
*/
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
            backtracking(s,i+1);//判断切割后的是否有回文串
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
