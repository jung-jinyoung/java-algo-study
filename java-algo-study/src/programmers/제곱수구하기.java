package programmers;

public class 제곱수구하기 {
        public static long solution(long n) {
            long sqrt = (long) Math.sqrt(n);
            if (sqrt*sqrt == n) {
                return (sqrt + 1) * (sqrt + 1);
            } else {
                return -1;
            }
    }
}
