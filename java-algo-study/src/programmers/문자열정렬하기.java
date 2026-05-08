package programmers;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120850
 * 문자열 + 배열리스트 연습
 */


import java.util.*;

public class 문자열정렬하기 {
    public int[] solution(String my_string) {
        // 1. 숫자를 담을 가변 리스트 생성
        ArrayList<Integer> check = new ArrayList<>();
        for (int i = 0 ; i < my_string.length() ; i++){
            char c = my_string.charAt(i);
            if (Character.isDigit(c)){
                check.add(Character.getNumericValue(c));
            }
        }
        Collections.sort(check); // 오름차순 정렬
        // 정답 배열 초기화
        int [] answer = new int[check.size()];
        for (int j = 0 ; j < check.size(); j++){
            answer[j] = check.get(j);
        }
        return answer;
    }
}
