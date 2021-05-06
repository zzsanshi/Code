package Array_list;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        // 方法1
        List<String> stringList = new ArrayList<String>();
        stringList.add("a");
        stringList.add("b");
        String[] stringArrayA = stringList.toArray(new String[stringList.size()]);

        // 方法2
        String[] stringArrayB = new String[stringList.size()];
        for(int i=0;i<stringList.size();i++) {
            stringArrayB[i] = stringList.get(i);
        }
    }
}
