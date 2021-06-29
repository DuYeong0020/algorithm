# 11399번

https://www.acmicpc.net/problem/11399

## 문제 접근 방법

일반적인 그리디 알고리즘을 활용하면 된다.

그리디 알고리즘이란 : 어떤  경우 중 하나를 결정해야 할 때 마다 그 순간 최적이라고 생각되는것을
                    선택해 나가는 방식으로 진행하여 최종적인 해답에 도달한다.

그리디 알고리즘이 코딩테스트에 나오는 비율 => 출제 빈도(낮음), 평균 점수(낮음)
출처 : https://programmers.co.kr/learn/challenges

### 문제 풀이

인출 시간이 최소값이 되야 한다. 각 인원마다 인출 시간이 다르다.
생각을 해 보면 앞 사람의 인출시간이 길어지면 뒷 사람ㅇ은 빨리 인출 할 수 있음에도 기다려야한다.
그럼 최소값ㅇ이 되려면 줄을 설 때 빨리 인출하는 사람이 앞에 서면 된다.

즉 걸리는 시간의 배열ㅇ을 오름차순 하고 그 오름차순한 값을 더하면 최소의 인출시간이 나온다.

## 코드

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] times = new int[n];
		int sum = 0, result = 0;
		
		for (int i=0; i<n; i++) {
			times[i] = scan.nextInt();
		}
		
		Arrays.sort(times);
		
		for (int i=0; i<n; i++) {
			sum += times[i];
			result += sum;
		}
		
		System.out.println(result);
		scan.close();
	}

}
```