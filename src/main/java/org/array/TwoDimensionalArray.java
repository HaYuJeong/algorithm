package org.array;

/**
 * packageName : org.array
 * fileName : twoDimensionalArray
 * author : hayj6
 * date : 2024-07-04(004)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-04(004)         hayj6          최초 생성
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {

    }
    public static int solution(int[][] board, int k) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    answer = answer + board[i][j];
                }
            }
        }

        return answer;
    }
}
