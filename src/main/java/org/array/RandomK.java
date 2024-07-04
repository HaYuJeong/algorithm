package org.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 * packageName : org.array
 * fileName : RandomK
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
public class RandomK {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        List<Integer> list;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);        // 중복 제거한 숫자
        }
        list = new ArrayList<>(set);    // 배열에 넣음

        list.sort(Comparator.naturalOrder());   // 오름차순

        answer = new int[k];

        if (list.size() == k) {
            for (int i = 0; i < k; i++) {
                answer[i] = list.get(i);
            }
        } else if (list.size() < k) {
            for (int i = 0; i < k; i++) {
                if (i > list.size()-1) {
                    answer[i] = -1;
                } else {
                    answer[i] = list.get(i);
                }
            }
        }
        else {
            for (int i = 0; i < k; i++) {
                answer[i] = list.get(i);
            }
        }

        return answer;
    }
}
