package BasicCode;
/*
문제
- 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
  하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
입력
- 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
출력
- 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
ex 1)
입력
- 5
출력
-*****
 ****
 ***
 **
 *
 */
import java.util.Scanner;

public class Baekjoon2441 {
  public static void main(String[] agrs) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}