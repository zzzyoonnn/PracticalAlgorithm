package Queue;
/*
문제
- 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
  명령은 총 여섯 가지이다.
    push X: 정수 X를 큐에 넣는 연산이다.
    pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    size: 큐에 들어있는 정수의 개수를 출력한다.
    empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
    front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
입력
- 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
  둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 
  주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 
  문제에 나와있지 않은 명령이 주어지는 경우는 없다.
출력
- 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
ex 1)
입력        출력
- 15        - 1
  push 1      2
  push 2      2
  front       0
  back        1
  size        2
  empty       -1
  pop         0
  pop         1
  pop         -1
  size        0
  empty       3
  pop
  push 3
  empty
  front
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon10845 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Queue <Integer> queue = new LinkedList<>();
    int last = 0;
    StringTokenizer st;

    while (n-- > 0) {
      st = new StringTokenizer(br.readLine());
      String s = st.nextToken(); 

      switch(s) {
        case "push" :
          last = Integer.parseInt(st.nextToken());
          queue.offer(last);
          break;

        case "pop" :
          System.out.println(queue.isEmpty() ? -1 : queue.poll());
          break;

        case "size" :
          System.out.println(queue.size());
          break;

        case "empty" :
          System.out.println(queue.isEmpty() ? 1 : 0);
          break;

        case "front" :
          System.out.println(queue.isEmpty() ? -1 : queue.peek());
          break;

        case "back" :
          System.out.println(queue.isEmpty() ? -1 : last);
          break;
      }
    }
  }
}
