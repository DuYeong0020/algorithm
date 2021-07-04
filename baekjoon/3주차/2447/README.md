# 2447번

https://www.acmicpc.net/problem/2447

## 문제 접근 방법
재귀를 사용하여 각각의 상황들을 분할합니다. 그리고 제일 작은 사이즈에 도착했을 때 값을 넣는(정복) 연산을 수행하여
별을 넣어야 하는 모든 좌표에 도달하는 방식으로 해결합니다.


```java
import java.util.*;

public class Main {
    // 배열 선언
    static char[][] field;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        // 배열 초기화
        field = new char[n][n];
        // 배열을 *이라는 값으로 모두 채우고
        for(int i=0; i<field.length; i++)
            Arrays.fill(field[i], ' ');
        // 출력
        recur(n, 0, 0);
        for(int i=0; i<field.length; i++){
            for(int j=0; j<field[0].length; j++)
                sb.append(field[i][j]);
            sb.append('\n');
        }
        System.out.print(sb);
    }
    static void recur(int size, int x, int y){
        if(size==1){
            field[y][x] = '*';
            return;
        }
        recur(size/3, x, y); // 좌상
        recur(size/3, x+size/3, y);// 상
        recur(size/3, x+size/3*2, y);// 우상
        recur(size/3, x, y+size/3);// 좌
        recur(size/3, x+size/3*2, y+size/3);// 우
        recur(size/3, x, y+size/3*2);// 좌하
        recur(size/3, x+size/3, y+size/3*2);// 하
        recur(size/3, x+size/3*2, y+size/3*2);// 우하
    }
}
```