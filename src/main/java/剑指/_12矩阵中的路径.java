package 剑指;

public class _12矩阵中的路径 {
    //回溯
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        int m = board.length, n = board[0].length;
        int inx = 0;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                if (backtracking(board, words, i, j,0)) {
                    return true;
                }
            }
        }
        return false;
    }
    boolean backtracking(char[][] board, char[] words,int i, int j, int inx) {
        if ( i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != words[inx]) {
            return false;
        }
        if ( inx == words.length - 1) {
            return true;
        }
        char temp = board[i][j];
        board[i][j] = '\0';
        boolean res = backtracking(board, words, i-1, j,inx+1) || backtracking(board, words, i+1, j,inx+1)  || backtracking(board, words, i, j-1,inx+1)
                || backtracking(board, words, i, j+1,inx+1);
        board[i][j] = temp;
       return res;
    }
}
