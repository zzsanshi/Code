package leecode热门100题;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class _146LRU缓存机制 {
    class LRUCache {
        Map<Integer,Integer> map ;
        Deque<Integer> que = new LinkedList<>();
        Deque<Integer> swap = new LinkedList<>();
        int capacity;

        public LRUCache(int capacity) {
            map = new HashMap<>(capacity);
            this.capacity = capacity;
        }

        public int get(int key) {
            if(map.containsKey(key)) {
                int val = map.get(key);
                mod(key);
                return val;
            }else {
                return -1;
            }
        }

        public void put(int key, int value) {
            if(map.containsKey(key)) {
                map.put(key,value);
                mod(key);
            }else {
                if(map.size() == capacity) {
                    int rm= que.pollFirst();
                    map.remove(rm);
                }
                map.put(key,value);
                mod(key);
            }
            // 查询链表
        }
        public void mod(int key) {
            //操作权值
            if(que.size() < capacity) {
                que.offerLast(key);
            }else {
                for (int i = 0; i < capacity; i++) {
                    if(que.peekFirst() == key) {
                        que.pollFirst();
                        que.offerLast(key);
                        break;
                    } else {
                        swap.offerLast(que.pollFirst());
                    }
                }
                while(!swap.isEmpty()) {
                    que.addFirst(swap.pollLast());
                }
            }
        }
    }
}
