# 1620번

https://www.acmicpc.net/problem/1620

## 문제 접근 방법
몬스터와 숫자를 key, value로 저장을 한다.
하지만 HashMap에서 이중 for로 검사를 했을 때 시간 낭비가 되기 문에
숫자로 접근을 할 때는 ArrayList의 인덱스,
String으로 접근을 할 때는 HashMap을 활용하여 해결한다.


## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;

class Main{
    public static void main(String[] args) throws IOException{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int monNum = Integer.parseInt(str.split(" ")[0]);  
        int qstNum = Integer.parseInt(str.split(" ")[1]);
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i=1; i<=monNum; i++) {
            String mon = br.readLine();
            map.put(mon, i);
            arr.add(mon);
        }
        
        for(int j = 0; j<qstNum; j++) {
            String key = br.readLine();
            if(map.containsKey(key)){
                bw.write(map.get(key)+"\n");
            }
            else if(Integer.parseInt(key)<=arr.size()){
                int index = Integer.parseInt(key);
                bw.write(arr.get(index-1)+"\n");
            }
            
            
            
        }
        br.close();
        bw.flush();
        bw.close();

       
    }
}
```