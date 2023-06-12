package com.sametkula.java.PT_arrays.leetcode.validSudoku;

public class Solution {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j< board.length; j++)
                if (isColAndRowHaveAnother(board, i, j) || !isCellValid(board, i, j))return false;

        return true;
    }
    public static boolean isCellValid(char[][] board, int coll, int row) {
        int cell1 = coll - coll % 3, cell2 = row - row % 3;

        StringBuilder controller = new StringBuilder();
        for (int i = cell1; i < cell1 + 3; i++)
            for (int j = cell2; j < cell2 + 3; j++){
                if (board[i][j] == '.') continue;

                if (controller.toString().contains(String.valueOf(board[i][j])))
                    return false;
                else
                    controller.append(board[i][j]);
            }


        return true;
    }
    public static boolean isColAndRowHaveAnother(char[][] board, int coll, int row){
        for (int j = 0; j < board.length; j++) {
            if (j == row) continue;

            if (board[coll][row]  == board[coll][j] && board[coll][j] != '.') return true;
        }
        for (int i = 0; i < board.length; i++) {
            if (i == coll) continue;

            if (board[i][row]  == board[coll][row] && board[i][row] != '.') return true;
        }

        return false;
    }
}
