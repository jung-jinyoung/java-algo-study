package programmers;
import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 * (1) 배열 문제 접근 : 배열 정렬 학습
 * (2) 리스트 문제 접근 : 리스트 정렬 학습
 */
public class 나누어떨어지는숫자배열 {

    class Solution1 {
        public int[] solution(int[] arr, int divisor) {
            // 1. 나누어지는 숫자 카운트 초기화
            int count = 0 ;

            for (int x : arr){
                if (x % divisor == 0) count++;
            }

            // 2. 카운트가 0일 경우 [-1] 반환
            if (count == 0) return new int[]{-1};

            // 3. 카운트만큼 배열 초기화 후 추가
            int[] answer = new int[count];
            int index = 0 ;
            for (int x : arr) {
                if (x % divisor == 0) answer[index++] = x;
            }

            // 4. 배열 정렬
            Arrays.sort(answer);
            return answer;
        }
    }

    class Solution2 {
        public int[] solution(int[] arr, int divisor) {
            // 1. ArrayList 생성
            ArrayList<Integer> list = new ArrayList<>();
            // 2. 배열 순회하며 나누어 떨어지는 경우 list 추가
            for (int x : arr){
                if (x % divisor == 0) list.add(x);
            }
            // 3.리스트 크기 확인
            int n = list.size();

            // 4.만약 하나도 없다면 -1 반환
            if (n == 0) return new int[]{-1};

            // 5.list 오름차순 정렬
            Collections.sort(list);

            // 6. answer 크기 만큼 생성 후 반환

            int[] answer = new int[n];
            for (int i = 0 ; i < n ; i++){
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
