package programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916?language=java
 * 문자열 연습
 * 배열 전환 후 filter문도 가능 할 것 같다.
 */

// 문자열 인덱스로 하나씩 접근 toCharAt()
public class 문자열내P와Y의개수 {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0 ; // p -> +1, y -> -1
        System.out.println(s.chars());

        s = s.toLowerCase(); // 모두 소문자로 변환
        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if (c == 'p'){
                count++;
            } else if (c == 'y'){
                count--;
            } else {
                continue;
            }
        };

        return count == 0 ;
    }
}