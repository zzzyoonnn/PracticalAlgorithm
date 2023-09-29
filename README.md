# Practical Algorithm

[바킹독의 실전 알고리즘]을 들으며 공부한 레파지토리 입니다.<br>
영상 링크 : <https://www.youtube.com/playlist?list=PLtqbFd2VIQv4O6D6l9HcD732hdrnYb6CY>

### 0x02 기초 코드 작성 요령

BasicCode

### 0x03 배열

- 배열 : 메모리 상에 원소를 연속하게 배치한 자료구조

- 배열의 성질
  - O(1)에 k번째 원소를 확인/변경 가능
  - 추가적으로 소모되는 메모리의 양(=overhead)가 거의 없음
  - Cache hit rate가 높음
  - 메모리 상에 연속한 구간을 잡아야 해서 할당에 제약이 걸림
  - 임의의 위치에 있는 원소를 확인/변경 = O(1)
  - 원소를 끝에 추가 = O(1)
  - 마지막 원소를 제거 = O(1)
  - 임의의 위치에 원소를 추가/임의 위치에 있는 원소 제거 = O(n)

### 0x04 연결 리스트

- 연결 리스트의 성질

  - k번째 원소를 확인/변경하기 위해 O(k)가 필요함
  - 임의의 위치에 원소를 추가/임의 위치의 원소 제거는 O(1)
  - 원소들이 메모리 상에 연속해있지 않아 Cache hit rate가 낮지만 할당이 다소 쉬움
  - 임의의 위치에 있는 원소를 확인/변경 = O(n)
  - 임의의 위치에 있는 원소를 추가/임의 0위치의 원소 제거 = O(1)

- 연결 리스트의 종류

  - 단일 연결 리스트(Singly Linked List) : 각 원소가 자신의 다음 원소의 주소를 들고 있는 연결 리스트
  - 이중 연결 리스트(Doubly Linked List) : 각 원소가 자신의 이전 원소와 다음 원소의 주소를 둘 다 들고 있음, 메모리를 더 사용함
  - 원형 연결 리스트(Circular Linked List) : 끝이 처음과 연결됨

- 배열 VS 연결 리스트
  ||배열|연결 리스트|
  |---|---|---|
  |k번째 원소의 접근|O(1)|O(k)|
  |임의 위치에 원소 추가/제거|O(n)|O(1)|
  |메모리 상의 위치|연속|불연속|
  |추가적으로 필요한 공간(Overhead)|-|O(n)|

### 0x05 스택

- 스택 : 데이터를 차곡차곡 쌓아 올린 형태의 자료구조

- 스택의 성질
  - 먼저 들어간 원소가 마지막에 나옴 -> FILO(First In Last Out) 자료구조
  - Restricted Structure : 특정 위치에서만 원소를 넣거나 뺄 수 있는 제한 有 (+ 큐, 덱)
  - 원소의 추가 = O(1)
  - 원소의 제거 = O(1)
  - 제일 상단의 원소 확인 = O(1)
  - 제일 상단이 아닌 나머지 원소들의 확인/변경은 원칙적으로 불가능

### 0x06 큐

- 큐 : 한쪽 끝에서 원소를 넣고 반대쪽 끝에서 원소를 뺄 수 있음 -> FIFO(Fist In first Out) 자료구조
- 큐의 성질
  - 원소의 추가 = O(1)
  - 원소의 제거 = O(1)
  - 제일 앞(front)/뒤(rear)의 원소 확인 = O(1)
  - 제일 앞/뒤가 아닌 나머지 원소들의 확인/변경은 원칙적으로 불가능

### 0x07 덱

### 0x08 스택의 활용

### 0x09 BFS
