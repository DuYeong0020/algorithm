# 9095번

https://www.acmicpc.net/problem/9095

## 문제 접근 방법
n의 경우의 수를 구하기 위해 생각을 해보자.
마지막 덧셈의 숫자를 1로 채우는 경우, 2로 채우는 경우, 3으로 채우는 경우가 있을 것이다.
n의 경우의 수는 결국 n-1의 경우의 수 + n-2의 경우의 수 + n-3의 경우의 수라는 것이다.
초기에 n이 1인 경우 1가지, n이 2인 경우 2가지, n이 3인 경우 4가지이다.
앞에 설명한 두가지를 이용하여 n이 3인 경우 까지 구하였기에 n이 4부터 문제에서 설명한 n이 10까지 증가시켜 공식을 
적용하면 문제를 해결할 수 있다.


```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());

        // 테스트 값 배열로 저장
        int[] nArr = new int[T];
        for (int i = 0; i < nArr.length; i++) {
            nArr[i] = Integer.parseInt(br.readLine());
        }

        // n의 방법의 수를 저장할 배열 선언
        int[] ansArr = new int[11];
        
        // 초기값 설정
        ansArr[1] = 1;
        ansArr[2] = 2;
        ansArr[3] = 4;
        

        for (int i = 4; i < 11; i++) {
            ansArr[i] = ansArr[i-3] + ansArr[i-2] + ansArr[i-1];
            
        }
        // 테스트 n의 방법의 수 츨력
        for (int i : nArr) {
            bw.write(ansArr[i]+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
```