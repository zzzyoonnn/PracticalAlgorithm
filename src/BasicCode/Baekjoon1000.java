package BasicCode;
/*
문제
- 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
입력
- 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
출력
- 첫째 줄에 A+B를 출력한다.
ex 1)
입력        출력
- 1 2       - 3
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1000 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    System.out.println(a + b);
  }
}
