package org.basic;

/**
 * packageName : org.basic
 * fileName : CompareArray
 * author : hayj6
 * date : 2024-07-06(006)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-06(006)         hayj6          최초 생성
 */
public class CompareArray {
    public static void main(String[] args) {
        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};
        System.out.println(solution(arr1, arr2));
    }
    public static int solution(int[] arr1, int[] arr2) {
        if (arr1.length < arr2.length) {
            return -1;
        } else if (arr1.length > arr2.length) {
            return 1;
        } else {
            int sum = 0;
            int sum2 = 0;
            {
                for (int i : arr1){
                    sum += i;
                }
                for (int i2 : arr2){
                    sum2 += i2;
                }
            }
            if (sum > sum2) {
                return 1;
            } else if (sum < sum2) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
