package org.hash;

import java.util.HashSet;
import java.util.Scanner;

/**
 * packageName : org.hash
 * fileName : PocketMon
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
public class PocketMon {
    public static void main(String[] args) {
//        int nums[] = new int[0];    // nums = [3,2,1,3]
        int nums[] = new int[]{3, 2, 1, 3};
        int len = nums.length;      // len = 4

        HashSet<Integer> set = new HashSet<>();     // 중복을 거르는 자료구조 HashSet
        for (int i = 0; i < len; i++) {
            set.add(nums[i]);
        }


        System.out.println(Math.min(set.size(), len/2));
//        int setLen = (set.size() * set.size()-1) / 2 ;
//        if ( setLen <= len/2) {
//            System.out.println(setLen);
//        } else {
//            System.out.println(len/2);
//        }
    }
}
