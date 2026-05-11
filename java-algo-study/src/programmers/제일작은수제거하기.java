package programmers;

import java.util.*;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12935
 * (1) 기본 배열 연습
 * (2) 리스트 연습 - 특정 요소 삭제, 빈 배열 처리
 */

public class 제일작은수제거하기 {
    public int[] solution1(int[] arr) {
        // 배열의 길이가 1인 경우 처리
        if (arr.length <= 1) return new int[]{-1};

        // 최솟값 찾기
        int min = arr[0];
        for (int n : arr){
            if (n < min) min = n ;
        }

        // 최솟값을 제외한 크기의 새 배열 생성
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int m : arr){
            // 최솟값인 경우 건너뛰기
            if (min == m) continue;

            answer[index++] = m;
        }

        return answer;
    }

    public int[] solution2(int[] arr) {
        // 1. 조건 처리: 빈 배열이 되거나 요소가 하나면 [-1] 반환
        if (arr.length <= 1) return new int[]{-1};

        // 2. int 배열을 ArrayList로 변환
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : arr) list.add(x);

        // 3. Collections.min() 활용한 최솟값 찾기
        int min = Collections.min(list);

        // 4. 리스트에서 최솟값 삭제
        // 인덱스 접근이 아니기 때문에 객체 변환
        list.remove(Integer.valueOf(min));

        // 5. 다시 int[] 배열로 변환하여 반환
        int[] answer = new int[list.size()];
        for (int i =0 ; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
