package Deque;
/*
문제
- 지민이는 N개의 원소를 포함하고 있는 양방향 순환 큐를 가지고 있다. 
  지민이는 이 큐에서 몇 개의 원소를 뽑아내려고 한다.
  지민이는 이 큐에서 다음과 같은 3가지 연산을 수행할 수 있다.
    1. 첫 번째 원소를 뽑아낸다. 이 연산을 수행하면, 원래 큐의 원소가 a1, ..., ak이었던 것이 a2, ..., ak와 같이 된다.
    2. 왼쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 a2, ..., ak, a1이 된다.
    3. 오른쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 ak, a1, ..., ak-1이 된다.
  큐에 처음에 포함되어 있던 수 N이 주어진다. 
  그리고 지민이가 뽑아내려고 하는 원소의 위치가 주어진다. (이 위치는 가장 처음 큐에서의 위치이다.) 
  이때, 그 원소를 주어진 순서대로 뽑아내는데 드는 2번, 3번 연산의 최솟값을 출력하는 프로그램을 작성하시오.
입력
- 첫째 줄에 큐의 크기 N과 뽑아내려고 하는 수의 개수 M이 주어진다. 
  N은 50보다 작거나 같은 자연수이고, M은 N보다 작거나 같은 자연수이다. 
  둘째 줄에는 지민이가 뽑아내려고 하는 수의 위치가 순서대로 주어진다. 
  위치는 1보다 크거나 같고, N보다 작거나 같은 자연수이다.
출력
- 첫째 줄에 문제의 정답을 출력한다.
ex 1)
입력        출력
- 10 3      - 0
  1 2 3
ex 2)
입력        출력
- 10 3      - 8
  2 9 5
ex 3)
입력                출력
- 32 6              - 59
  27 16 30 11 6 23
ex 4)
입력                출력
- 10 10             - 14
  1 6 3 2 7 9 8 4 10 5
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baekjoon1021 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] find = new int[m];
    int num = 0;
    LinkedList<Integer> q = new LinkedList<>();
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) find[i] = Integer.parseInt(st.nextToken());

    for (int i = 0; i < n; i++) q.add(i + 1);

    for (int i = 0; i < m; i++) {
      while (q.peek() != find[i]) {
        int temp = q.size() / 2;
        // 뽑으려는 값이 중간보다 앞에 있을 때
        if (q.indexOf(find[i]) <= temp) {
          num++;
          q.add(q.poll());
        }
        // 뽑으려는 값이 중간보다 뒤에 있을 때
        else {
          num++;
          q.addFirst(q.pollLast());
        }
      }
      // while문을 탈출했으므로, q.peek == find[i]
      q.poll();
    }
    bw.write(String.valueOf(num));
    br.close();
    bw.flush();
    bw.close();
  }
}
