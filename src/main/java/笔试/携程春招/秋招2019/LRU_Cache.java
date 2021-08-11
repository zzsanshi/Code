package 笔试.携程春招.秋招2019;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class LRU_Cache {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = Integer.valueOf(cin.nextLine());
        //cin.nextLine();
        cache c = new cache(n);
        ArrayList<Integer> res = new ArrayList<>();
        while (cin.hasNextLine()) {
            if(n == 0) {
                String[] s = cin.nextLine().trim().split(" ");
                if (s[0].equals("g")) {
                    System.out.println("-1");
                }
            }else{
            String[] s = cin.nextLine().trim().split(" ");
            //System.out.println(s[0]);
            //System.out.println(s[0]);
            if (s[0].equals("p")) {
                //System.out.println(s[0]);
                c.put(Integer.valueOf(s[1]), Integer.valueOf(s[2]));
            } else {
                int i = c.get(Integer.valueOf(s[1]));
                System.out.println(i);
                res.add(i);
            }}

        }


    }
}

class cache {
    HashMap<Integer, Integer> map;
    LinkedList<Integer> deque;
    int size;

    public cache(int n) {
        this.size = n;
        this.map = new HashMap<>(n);
        deque = new LinkedList<Integer>();
    }

    int get(int key) {
        //顺序要变
        if (map.containsKey(key)) {
            if (deque.peekFirst() != key)
                deque.addFirst(key);
            return map.get(key);
        } else {
            return -1;
        }
    }

    void put(int key, int value) {
        if (deque.size() < size) {
            map.put(key, value);
            //System.out.println(value);
            deque.addFirst(key);
        } else {
            if (map.containsKey(key)) {
                map.put(key, value);
            } else {//不包含
                //修改顺序
                while (deque.size() > map.size()) {
                    deque.removeLast();
                }
                //去除最不常用的
                map.remove(deque.peekLast());
                //System.out.println("quchu" + deque.peekLast());
                deque.removeLast();
                map.put(key, value);
                deque.addFirst(key);
            }
        }


    }
}
