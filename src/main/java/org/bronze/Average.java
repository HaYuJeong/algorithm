package org.bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * packageName : org.bronze
 * fileName : Average
 * author : hayj6
 * date : 2024-07-03(003)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-03(003)         hayj6          최초 생성
 */
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();    // 3

        ArrayList<Double> list = new ArrayList<>(); // 배열 생성

        for (int i = 0; i < N; i++) {
            double score = scanner.nextDouble();
            list.add(score);                    // 배열에 들어오는 값들 넣기
        }

        double max = Collections.max(list);     // 배열들 중에서 최대값 구하기

        for (int i = 0; i < N; i++) {
            list.set(i, list.get(i)/max*100);
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum  + list.get(i);
        }

        System.out.println(sum/N);

    }
}
