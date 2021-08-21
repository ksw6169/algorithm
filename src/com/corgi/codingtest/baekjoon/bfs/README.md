## 너비 우선 탐색(Breadth-First Search, BFS) 이란?

- 탐색을 할 때 너비를 우선으로 하여 탐색을 수행하는 알고리즘
- 특히나 '맹목적인 탐색'을 하고자 할 때 사용할 수 있는 탐색 기법
- 너비 우선 탐색은 '최단 경로'를 찾아준다는 점에서 최단 길이를 보장해야 할 때 많이 사용
- 루트 노드로부터 가까운 노드들부터 탐색이 이루어진다는 점에서 너비 우선 탐색이라 한다.
- BFS는 너비를 우선으로 하여 탐색한다는 특성이 중요한 것이고, 이를 이용해 다른 알고리즘에 적용한다는 것이 핵심이다. BFS는 그 자체로는 큰 의미가 없다고 보면 된다.
- 준비물은 Queue로 흔히 미로 찾기 같은 곳에서 많이 사용된다.

## 실전

- BFS는 맨 처음에 시작 노드(Start Node)를 큐에 삽입하면서 시작한다.
- 또한 시작 노드를 방문했다고 '방문 처리'를 해준다.
- BFS는 다음과 같은 간단한 알고리즘에 따라서 작동한다.

```
1. 큐에서 하나의 노드를 꺼낸다.
2. 해당 노드에 연결된 노드 중 방문하지 않은 노드를 방문하고, 차례대로 큐에 삽입한다.
3. 1~2를 반복한다.
```

- 코드는 다음과 같다.

```cpp
#include <iostream>
#include <queue>
#include <vector>

using namespace std;

int number = 7;
int c[7];  // 방문 표시할 배열
vector<int> a[8];  // 

void bfs(int start) {
    queue<int> q;
    q.push(start);
    c[start] = true;

    while (!q.empty()) {
        int x = q.front();  // q의 앞부분 추출
        q.pop();            // q의 앞부분 제거
        printf("%d ", x);   // 출력

        for (int i=0; i<a[x].size(); i++) {
            int y = a[x][i];
            if (!c[y]) {      // 방문하지 않은 노드라면
                q.push(y);    // 큐에 push 처리
                c[y] = true;  // 방문 표시
            }
        }
    }
}

int main(void) {
    // 1과 2를 연결
    a[1].push_back(2));
    a[2].push_back(1));
    
    // 1과 3을 연결
    a[1].push_back(3));
    a[3].push_back(1));
    
    // 2와 3을 연결
    a[2].push_back(3));
    a[3].push_back(2));

    // 2와 4를 연결
    a[2].push_back(4));
    a[4].push_back(2));
   
    // 2와 5를 연결
    a[2].push_back(5));
    a[5].push_back(2));
    
    // 3과 6을 연결
    a[3].push_back(6));
    a[6].push_back(3));

    // 3과 7을 연결
    a[3].push_back(7));
    a[7].push_back(3));

    // 4와 5를 연결
    a[4].push_back(5));
    a[5].push_back(4));

    // 6과 7을 연결
    a[6].push_back(7));
    a[7].push_back(6));

    bfs(1);

    return 0;
}
```

## 참고 자료

- [15. 너비 우선 탐색(BFS)ㅣ안경잡이개발자]([https://blog.naver.com/ndb796/221230944971](https://blog.naver.com/ndb796/221230944971))
- [16강 - 너비 우선 탐색(Breadth First Search) [실전 알고리즘 강좌]ㅣ동빈나]([https://www.youtube.com/watch?v=66ZKz-FktXo&list=PLRx0vPvlEmdDHxCvAQS1_6XV4deOwfVrz&index=16](https://www.youtube.com/watch?v=66ZKz-FktXo&list=PLRx0vPvlEmdDHxCvAQS1_6XV4deOwfVrz&index=16))