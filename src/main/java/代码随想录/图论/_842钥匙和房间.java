package 代码随想录.图论;

import java.util.ArrayList;
import java.util.List;

public class _842钥匙和房间 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        dfs(rooms,0,visited);
        int i = 0;
        for (; i < n; i++) {
            if (visited[i] == false) {
                break;
            }
        }
        if(i == n) {
            return true;
        }else{
            return false;
        }

    }
    void dfs(List<List<Integer>> rooms,int inx,boolean[] visited){
        //int n = rooms.size();
        visited[inx] = true;
        List<Integer> list = rooms.get(inx);
        for (int i = 0; i < list.size();i++){
            int j = list.get(i);
            if (visited[j] == false) {
                dfs(rooms,j,visited);
            }
        }
    }
}
