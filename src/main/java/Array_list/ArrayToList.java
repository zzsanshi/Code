package Array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String []array = new String[] {"A","BC","DEFE"};
        // 正确方法1
        List<String> stringListA = new ArrayList<>(Arrays.asList(array));
        stringListA.add("OPP");

        // 正确方法2
        List<String> stringListB = new ArrayList<>(array.length);
        Collections.addAll(stringListB,array);

        // 正确方法3
        List<String> stringListC = new ArrayList<>(array.length);
        for(String str:array) {
            stringListC.add(str);
        }
        //不使用基本类型
        List<String> list = Arrays.asList("a","b","c");
    }
}
