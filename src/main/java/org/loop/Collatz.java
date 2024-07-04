package org.loop;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : org.basic
 * fileName : Collatz
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
public class Collatz {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int[] solution(int n) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>(); // list배열 만들기

        while (n != 1) {        // n이 1이 될때까지 무한 반복 돌리기
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }

            list.add(n); // list 배열에 값 넣기 : 10 5 16 8 등등...
        }

        answer = new int[list.size()];  // answer크기 : list 배열 크기

        for (int i = 0; i < answer.length; i++) {   // answer에 list 값을 넣기
            answer[i] = list.get(i);
        }

        return answer;
    }
}
