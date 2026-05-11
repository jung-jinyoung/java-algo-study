package programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 * 배열 기본 연습
 */
public class x만큼간격이있는n개의숫자 {
    class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long [n];
            answer[0] = x;
            for (int i = 1 ; i < n ; i++){
                answer[i] = x + answer[i-1];
            }
            return answer;
        }
    }
}
