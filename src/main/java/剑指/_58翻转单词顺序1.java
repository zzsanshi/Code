package 剑指;

import java.util.Collections;

public class _58翻转单词顺序1 {
    public String reverseWords(String s) {
        String reverse = new StringBuffer(s).reverse().toString();
        String[] res=reverse.trim().split("");
        String s1 ="";
        for (int i = 0; i < res.length; i++) {
            if(res[i].equals("")) continue;
            s1 += new StringBuffer(res[i]).reverse().toString()+" ";
        }
        return s1.trim();
    }
}
