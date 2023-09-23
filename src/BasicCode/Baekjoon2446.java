package BasicCode;
/*
문제
- 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
입력
- 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
출력
- 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
ex 1)
입력
- 5
출력
-*********
 *******
 *****
 ***
 *
 ***
 *****
 *******
 *********
 */
import java.util.Scanner;

public class Baekjoon2446 {
  public static void main(String[] agrs) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = (2 * n) - (2 * i); j >= 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 1; i < n; i++) {
      for (int j = n - i - 1; j > 0; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i) + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}