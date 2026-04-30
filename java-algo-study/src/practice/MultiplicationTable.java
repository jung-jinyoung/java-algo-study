package practice;
import java.util.Scanner;

/**
 * 두 정수를 입력받아 사칙연산 아래와 같은 순서로 결과 출력
 * 더하기 - 빼기 - 곱하기 - 나누기 - 나머지
 */

public class MultiplicationTable {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단 몇단 ? : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= 9 ; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
