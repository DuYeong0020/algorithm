# 14681번

https://www.acmicpc.net/problem/14681

## 문제 접근 방법

if문으로 4개의 케이스를 나누어서 각가 다르게 출력

## 코드

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x>0 && y>0) // 1사분면
            System.out.print(1);
        else if (x<0 && y>0)// 2사분면
            System.out.print(2);
        else if (x<0 && y<0) // 3사분면
            System.out.print(3);
        else
            System.out.print(4);
    }
}
```