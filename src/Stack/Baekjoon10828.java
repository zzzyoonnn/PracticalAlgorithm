package Stack;
/*
문제
- 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
  명령은 총 다섯 가지이다.
    push X: 정수 X를 스택에 넣는 연산이다.
    pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    size: 스택에 들어있는 정수의 개수를 출력한다.
    empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
    top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
입력
- 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
  둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 
  주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 
  문제에 나와있지 않은 명령이 주어지는 경우는 없다.
출력
- 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
ex 1)
입력        출력
- 14        - 2
  push 1      2
  push 2      0
  top         2
  size        1
  empty       -1
  pop         0
  pop         1
  pop         -1
  size        0
  empty       3
  pop
  push 3
  empty
  top
ex 2)
입력        출력
- 7         - -1
  pop         -1
  top         123
  push 123    123
  top         -1
  pop         -1
  top
  pop
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10828 {
  public static int[] stack;
  public static int size = 0;

  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    stack = new int[n];
    StringTokenizer st;

    while (n-- > 0) {
      st = new StringTokenizer(br.readLine());
      switch (st.nextToken()) {
        case "push" :
          push(Integer.parseInt(st.nextToken()));
          break;

        case "pop" :
          sb.append(pop()).append('\n');
          break;

        case "size" :
          sb.append(size()).append('\n');
          break;

        case "empty" :
          sb.append(empty()).append('\n');
          break;

        case "top" :
          sb.append(top()).append('\n');
          break;
      }
    }
    System.out.println(sb);
  }

  public static void push(int item) {
    stack[size] = item;
    size++;
  }

  public static int pop() {
    if (size == 0) return -1;
    else {
      int res = stack[size - 1];
      stack[size - 1] = 0;
      size--;
      return res;
    }
  }

  public static int size() {
    return size;
  }

  public static int empty() {
    if (size == 0) return 1;
    else return 0;
  }

  public static int top() {
    if (size == 0) return -1;
    else return stack[size - 1];
  }
}
