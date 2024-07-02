package org.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName : org.basic
 * fileName : NumList
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
public class NumList {
    public static void main(String[] args) {
        int[] numList = {2,1,6};    // [0,1,2]
        Arrays.toString(numList);

        int last = numList[numList.length - 1]; // 6
        // numList.length - 1 = 2
        // int last = numList[2] = 6
        int lastest = numList[numList.length - 2];  // 1
        // int lastest = numList[1] = 1

        System.out.println("Difference: " + (last-lastest));   // 5

        List<Integer> arrList = new ArrayList<>();   // 기존 배열을 리스트로 만들기

        for (int num : numList){
            arrList.add(num);
        }

//        System.out.println(last);    // 6
//        System.out.println(lastest); // 1

        if (last > lastest) {
            arrList.add(last-lastest);  // 배열에 값 추가
        } else {
            arrList.add(lastest*2);
        }

        System.out.println(arrList);
//        System.out.println(arrList.toString(numList));
    }

}
