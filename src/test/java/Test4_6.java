import java.beans.IntrospectionException;
import java.util.*;

public class Test4_6 {
    public static void main(String[] args) {
        Integer[] a = {1,2};
        Arrays.sort(a,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        } );

        Arrays.sort(a, Collections.reverseOrder());

        List<Integer> b = new ArrayList<>();

        b.toArray();
        Arrays.asList();

        String s = "sss";
        char[] c = s.toCharArray();

    }

}
