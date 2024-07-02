package org.bronze;

import java.util.Scanner;

/**
 * packageName : org.bronze
 * fileName : Factorial
 * author : hayj6
 * date : 2024-07-02(002)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-02(002)         hayj6          최초 생성
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();  // 10
        int sum = 1;
        for (int i = 1; i <= a ; i++) {
            sum = i * sum;    // 1*2, 2*3, 3*4
        }
        System.out.println(sum);
    }
}
