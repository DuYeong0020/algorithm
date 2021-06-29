# 1620번

https://www.acmicpc.net/problem/1620

## 문제 접근 방법
포켓몬 이름과 숫자를 저장할 수 있는 HashMap을 이용하며 풀 수 있는 문제로 
key는 포켓몬 이름, value에는 포켓몬 번호를 저장하여 
포켓몬 이름을 입력했을 때 key로 검색하여 출력을 할 수 있지만 
포켓몬 번호를 입력했을 때 아래 코드와 같이 전체 key를 for로 돌려서 value의 값이 같은지를 비교하는 시간적 낭비가 발생한다.
설명하자면 처음에는 입력받은 값을 포켓몬 이름, 즉 key로 가정하고 검색을 한다. 
만약 key로 찾지 못하면 value의 포켓몬 번호일 것이기 때문에 int로 형변환하고 for문으로 key, value를 추출하여 value의 값을 비교한다.
## 처음에 접근한 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;

class Test{
    public static void main(String[] args) throws IOException{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int monNum = Integer.parseInt(str.split(" ")[0]);  
        int qstNum = Integer.parseInt(str.split(" ")[1]);
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=1; i<=monNum; i++) {
            String mon = br.readLine();
            map.put(mon, i);
        }
        
        for(int j = 0; j<qstNum; j++) {
            String key = br.readLine();
            if(map.containsKey(key)){
                bw.write(map.get(key)+"\n");
            }
            else { 
                int pocketNum = Integer.parseInt(key);
                for (String pocketName : map.keySet()) {
                    if(map.get(pocketName) == pocketNum ){
                        bw.write(pocketName+"\n");
                    }
                }
                
            }
        }
        br.close();
        bw.flush();
        bw.close();

       
    }
}
```
그렇기에 인덱스를 활용할 수 있는 배열을 선언하여 문제를 해결한다.

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