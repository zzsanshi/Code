package Iterator;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("张三1");
        list.add("张三2");
        list.add("张三3");
        list.add("张三4");

        List<String> linkList = new LinkedList<String>();
        linkList.add("link1");
        linkList.add("link2");
        linkList.add("link3");
        linkList.add("link4");

        Set<String> set = new HashSet<String>();
        set.add("set1");
        set.add("set2");
        set.add("set3");
        set.add("set4");
        //使用迭代器遍历ArrayList集合
        Iterator<String> listIt = list.iterator();
        while(listIt.hasNext()){
            System.out.println(listIt.next());
        }
        //使用迭代器遍历Set集合
        Iterator<String> setIt = set.iterator();
        while(setIt.hasNext()){
            System.out.println(listIt.next());
        }
        //使用迭代器遍历LinkedList集合
        Iterator<String> linkIt = linkList.iterator();
        while(linkIt.hasNext()){
            System.out.println(listIt.next());
        }
    }
}
