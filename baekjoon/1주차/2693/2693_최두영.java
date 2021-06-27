import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 값 입력받기
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        if (x>0) {
            if(y>0){
                bw.write(1+"\n");
            }else{
                bw.write(4+"\n");
            }
        } else {
            if (y>0) {
                bw.write(2+"\n");
            } else {
                bw.write(3+"\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();



    }
}