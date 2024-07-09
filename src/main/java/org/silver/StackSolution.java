package org.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/**
 * packageName : org.silver
 * fileName : Stack
 * author : hayj6
 * date : 2024-07-09(009)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-09(009)         hayj6          최초 생성
 */
public class StackSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();

        int N = Integer.parseInt(reader.readLine()) ;  // 입력하는 명령의 갯수

        for (int i = 0; i < N; i++) {
            String command = reader.readLine();
//            if (command == "push" + scanner.nextInt()) {
//                System.out.println(stack.push(scanner.next()));
            if (command.startsWith("push")){
                String[] parts = command.split(" ");
                stack.push(parts[1]);
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } else if (command.equals("size")) {
                System.out.println(stack.size());
            } else if (command.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else{
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
