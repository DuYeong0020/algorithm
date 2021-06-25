# 1300번

https://www.acmicpc.net/problem/1300

## 문제 접근 방법

k번째 숫자는 mid/i와 N 중에 작은 수를 계속 더한 값이 나온다

## 코드

```java
import java.io.*;
import java.util.*;
class Main{
   
   static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
   
   public static void main(String args[]) throws Exception {
	   long N=Long.parseLong(br.readLine());
	   long K=Long.parseLong(br.readLine());
	   
	   long left=1;
	   long right=K;
	   long result=0;
	   
	   while(left<=right) {
		   long cnt=0;
		   long mid=(left+right)/2;
		   for(int i=1;i<=N;i++) {
			   cnt+=Math.min(mid/i, N);
		   }
		   if(cnt<K) {
			   left=mid+1;
		   }
		   else{
			   right=mid-1;
			   result=mid;
		   }
	   }
	   System.out.println(result); 
   }
}
```