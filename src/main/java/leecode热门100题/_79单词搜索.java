package leecode热门100题;

public class _79单词搜索 {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] used = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (backtrace(board, word, i, j, used, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean backtrace(char[][] board, String word, int i, int j, boolean[][] used, int inx) {
        if (inx == word.length() - 1 && board[i][j] == word.charAt(inx)) {
            return true;
        }
        if (board[i][j] != word.charAt(inx)) {
            return false;
        }
        used[i][j] = true;
        if (i - 1 >= 0 && used[i - 1][j] == false) {
            if (backtrace(board, word, i - 1, j, used, inx + 1)) {
                used[i][j] = false;
                return true;
            }
        }
        if (i + 1 < board.length && used[i + 1][j] == false) {
            if (backtrace(board, word, i + 1, j, used, inx + 1)) {
                used[i][j] = false;
                return true;
            }
        }
        if (j + 1 < board[0].length && used[i][j + 1] == false) {
            if (backtrace(board, word, i, j + 1, used, inx + 1)) {
                used[i][j] = false;
                return true;
            }
        }
        if (j - 1 >= 0 && used[i][j - 1] == false) {
            if (backtrace(board, word, i, j - 1, used, inx + 1)) {
                used[i][j] = false;
                return true;
            }
        }
        used[i][j] = false;
        return false;
    }
}
