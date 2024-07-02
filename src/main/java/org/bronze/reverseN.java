package org.bronze;

import java.util.Scanner;

/**
 * packageName : org.bronze
 * fileName : reverseN
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
public class reverseN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();  // 5
        for (int i = a; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
