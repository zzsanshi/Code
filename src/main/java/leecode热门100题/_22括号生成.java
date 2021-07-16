package leecode热门100题;

import java.util.ArrayList;
import java.util.List;

public class _22括号生成 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrace(res, new StringBuffer(), 0, 0, n);
        return res;
    }

    void backtrace(List<String> res, StringBuffer cur, int left, int right, int n) {
        if (cur.length() == n * 2) {
            res.add(cur.toString());
            return;
        }
        if (left < n) {
            cur.append('(');
            backtrace(res, cur, left + 1, right, n);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (right < left) {
            cur.append(')');
            backtrace(res, cur, left, right + 1, n);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
