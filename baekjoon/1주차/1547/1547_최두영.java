import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        // 컵 초기 설정
        Integer[] cup = new Integer[3];
        Arrays.fill(cup, -1);
        cup[0] = 1;
        for(int i = 0; i < num; i++) {
            String chgStr = br.readLine();
            int bfr = Integer.parseInt(chgStr.split(" ")[0])-1;
            int aft = Integer.parseInt(chgStr.split(" ")[1])-1;
            // 위치 바꾸기
            int temp = cup[bfr];
            cup[bfr] = cup[aft];
            cup[aft] = temp;

        }
        // 배열을 for로 돌려서 공의 위치가 1인 고 찾기
        for(int j = 0; j < 3; j++) {
            if(cup[j]==1) {
                bw.write(j+1+"\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();



    }
}
