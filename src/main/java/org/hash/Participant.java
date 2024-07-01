package org.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
public class Participant {

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }

        public static void main(String[] args) {
            String[] participant = {"leo", "kiki", "eden"};
            String[] completion = {"eden", "kiki"};

            System.out.println(solution(participant, completion));
        }
}