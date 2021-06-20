# 1547번

https://www.acmicpc.net/problem/1547

## 문제 접근 방법

while 문으로 예외처리, 반복문 작성 for 문으로 리스트 검색

## 코드

```java
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        while (cnt > 50){
            cnt = sc.nextInt();
        }
        int[] balls = {1,0,0};
        int chg1, chg2, tmp;
        while(cnt>0){
            chg1 = sc.nextInt()-1;
            chg2 = sc.nextInt()-1;
            while(chg1>2){
                chg1 = sc.nextInt();
            }
            while(chg2>2){
                chg1 = sc.nextInt();
            }
            while(chg2==chg1){
                chg1 = sc.nextInt();
            }
            tmp = balls[chg2];
            balls[chg2] = balls[chg1];
            balls[chg1] = tmp;
            cnt--;
        }
        for(int i = 0; i<3; i++){
            if(balls[i]==1){
                System.out.print(i+1);
            }
        }
    }
}

```