package programmers;

public class 나머지1구하기 {
    public int solution(int n) {
        int answer = n - 1;
        for (int i = 2 ; i < n-1 ; i++) {
            if ((n % i) == 1) {
                answer = i ;
                break ;
            }
        }
        return answer;
    }
}
