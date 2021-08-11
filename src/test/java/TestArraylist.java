import Array_list.ArrayToList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

        Iterator<Integer> iterator = list3.iterator();
        while (iterator.hasNext()){
            if(iterator.next() % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println(list3);
//        for (Integer i : list3) {
//            if (i % 2 == 0) {
//                list3.remove(i);
//            }
//        }
    }
}
