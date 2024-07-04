package org.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * packageName : org.hash
 * fileName : ㅖarticipant
 * author : hayj6
 * date : 2024-07-01(001)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-01(001)         hayj6          최초 생성
 */
public class KthNumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        solution(array, commands);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }
            list.sort(Comparator.naturalOrder());
            result.add(list.get(commands[i][2] - 1));
        }
        answer = new int[result.size()];    // 배열의 크기를 정해줘야 값을 넣을 수 있음
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}



