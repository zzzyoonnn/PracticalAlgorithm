package Deque;
/*
문제
- 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
  명령은 총 여덟 가지이다.
    push_front X: 정수 X를 덱의 앞에 넣는다.
    push_back X: 정수 X를 덱의 뒤에 넣는다.
    pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    size: 덱에 들어있는 정수의 개수를 출력한다.
    empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
    front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
입력
- 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
  둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 
  주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 
  문제에 나와있지 않은 명령이 주어지는 경우는 없다.
출력
- 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
ex 1)
입력              출력
- 15              - 2
  push_back 1       1
  push_front 2      2
  front             0
  back              2
  size              1
  empty             -1
  pop_front         0
  pop_back          1
  pop_front         -1
  size              0
  empty             3
  pop_back
  push_front 3
  empty
  front
ex 2)
입력              출력
- 22              - -1
  front             -1
  back              -1
  pop_front         -1
  pop_back          1
  push_front 1      1
  front             2
  pop_back          2
  push_back 2       333
  back              10
  pop_front         10
  push_front 10     333
  push_front 333    20
  front             1234
  back              1234
  pop_back          20
  pop_back
  push_back 20
  push_back 1234
  front
  back
  pop_back
  pop_back
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Baekjoon10866 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {
      String[] s = br.readLine().split(" ");

      switch (s[0]) {
        case "push_front" : {
          ad.addFirst(Integer.parseInt(s[1]));
          break;
        }

        case "push_back" : {
          ad.addLast(Integer.parseInt(s[1]));
          break;
        }

        case "pop_front" : {
          if (ad.isEmpty()) sb.append(-1).append('\n');
          else sb.append(ad.pollFirst()).append('\n');
          break;
        }

        case "pop_back" : {
          if (ad.isEmpty()) sb.append(-1).append('\n');
          else sb.append(ad.pollLast()).append('\n');
          break;
        }

        case "size" : {
          sb.append(ad.size()).append('\n');
          break;
        }

        case "empty" : {
          if (ad.isEmpty()) sb.append(1).append('\n');
          else sb.append(0).append('\n');
          break;
        }

        case "front" : {
          if (ad.isEmpty()) sb.append(-1).append('\n');
          else sb.append(ad.peekFirst()).append('\n');
          break;
        }

        case "back" : {
          if (ad.isEmpty()) sb.append(-1).append('\n');
          else sb.append(ad.peekLast()).append('\n');
          break;
        }
      }
    }
    System.out.println(sb);
  }
}
