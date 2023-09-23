package BasicCode;
/*
문제
- 두 양의 정수가 주어졌을 때, 두 수 사이에 있는 정수를 모두 출력하는 프로그램을 작성하시오.
입력
- 두 정수 A와 B가 주어진다.
출력
- 첫째 줄에 두 수 사이에 있는 수의 개수를 출력한다.
  둘째 줄에는 두 수 사이에 있는 수를 오름차순으로 출력한다.
ex 1)
입력
- 8 14
출력
- 5
  9 10 11 12 13
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10093 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());

    long n = b - a - 1;

    System.out.println(n);
    for (long i = n; i > 0; i--) {
      System.out.print((b - i) + " ");
    }
  }
}
