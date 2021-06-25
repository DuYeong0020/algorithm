# 1010번

https://www.acmicpc.net/problem/1010

## 문제 접근 방법

서쪽과 동쪽의 사이트를 연결하는 경우의 수를 구하기 위해선 사이트의 수가 더 많은 곳을 기준으로 잡아야 합니다.

문제에서의 예시로 보면 서쪽엔 4개 동쪽엔 7개의 사이트가 있는데 동쪽의 7개의 사이트 중에 4개를 뽑아야 하니 7C4의 연산이 나옵니다.

![https://www.acmicpc.net/upload/201003/pic1.JPG](img.png)

조합(Combination)의 연산을 하기 위해 조합의 특징중의 하나인 파스칼의 삼각형을 이용합니다.

[파스칼의 삼각형 - 위키백과, 우리 모두의 백과사전](https://ko.wikipedia.org/wiki/%ED%8C%8C%EC%8A%A4%EC%B9%BC%EC%9D%98_%EC%82%BC%EA%B0%81%ED%98%95)

nCr = (n-1)C(r-1) + (n-1)Cr 이므로 이걸 함수로 구현하면 아래와 같이 표현할 수 있습니다.

```java
int combination(int n, int r) {
    if (r == 0 || n == r) return 1;
    return memo[n][r] = combination(n-1, r-1) + combination(n-1, r);
}
```

구현한 함수로 입력 값중 더 큰값이 n 작은값이 r이라고 보고 문제를 풀어보면 아래와 같이 나옵니다.

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(combination(Math.max(a, b), Math.min(a, b)) + "\n");
        }
        System.out.print(sb);
    }

    static int combination(int n, int r) {
        if (r == 0 || n == r) return 1;
        return combination(n-1, r-1) + combination(n-1, r);
    }
}
```

그런데 문제에는 0.5초라는 시간제한이 있으므로 시간을 더 줄여줘야하는데 nCr의 n의 값이 커질수록 연산해야하는 depth가 깊어지므로 이전에 했던 연산을 저장하기위해 배열을 만들어주어 한 번 했던 연산은 저장하고 이전에 나왔던 연산이면 바로 return을 해주는 방식으로 코드를 수정합니다. (DP)

## 코드

```java
import java.io.*;
import java.util.*;

public class Main {
    static int[][] memo = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(combination(Math.max(a, b), Math.min(a, b)) + "\n");
        }
        System.out.print(sb);
    }

    static int combination(int n, int r) {
        if (r == 0 || n == r)
            return 1;
        if (memo[n][r] != 0) return memo[n][r];
        return memo[n][r] = combination(n-1, r-1) + combination(n-1, r);
    }
}
```