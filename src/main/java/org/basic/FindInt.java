package org.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : org.basic
 * fileName : FindInt
 * author : hayj6
 * date : 2024-07-06(006)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-06(006)         hayj6          최초 생성
 */
public class FindInt {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int n = 3;
        System.out.println(solution(num_list, n));
    }
    public static int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i : num_list) {
            if (i == n) {
                return 1;
            }
        }
        return 0;
        return answer;
    }
}
