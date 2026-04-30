package practice;
import java.util.Scanner;
/**
 * 입력된 배열에서 최댓값, 최솟값 찾기
 * 입력 순서 : 배열 크기 -> 숫자 차례로 입력
 */

public class ArrayMaxMin {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 길이를 입력하세요(0 입력 불가) : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("배열에 들어갈 정수를 입력해주세요");
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1 ; i < n ; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);

        sc.close();
    }
}
