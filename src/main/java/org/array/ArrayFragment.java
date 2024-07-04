package org.array;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : org.array
 * fileName : arrayFragment
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
public class ArrayFragment {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        solution(arr, query);
    }

    public static int[] solution(int[] arr, int[] query) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>(); // list 배열 생성

        for (int i = 0; i < arr.length; i++) {  // list 배열에 arr 배열의 값 넣기
            list.add(arr[i]);
        }

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                list.subList(query[i] + 1, list.size()).clear();  // i=0이면 list.subList(5,6).clear()={0,1,2,3,4}, list={0,1,2,3,4}
            } else {
                list.subList(0, query[i]).clear();              // list={0,1}
            }
        }

        answer = new int[list.size()];  // answer 배열의 크기 지정

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
