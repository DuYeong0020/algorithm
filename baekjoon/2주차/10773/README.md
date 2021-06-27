# 10773번

https://www.acmicpc.net/problem/10773

## 문제 접근 방법
0을 입력했을 때 최근에 입력했던 수를 지우고 아닐 때는 값을 더하는 것을 생각하면 FILO인
스택을 사용하여 0일때는 pop(), 0이 아닐때는 push() 를 이용하여 문제를 해결한다.

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
class Test{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 값 입력받기
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num!=0) {
                sum += stack.push(num);
                
            }else{
                sum -= stack.pop();
            }
        }
        bw.write(sum+"\n");
        
        bw.flush();
        br.close();
        bw.close();



    }
}
```

