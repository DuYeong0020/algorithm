import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine().trim());
        int[] ball = new int[4];
        for (int i = 1; i < ball.length; i++) {
            ball[i] =i;
        }
        int pos=0;
        int pos2=0;
        for (int i = 0; i < M; i++) {
            StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int j = 0; j < ball.length; j++) {
                if(ball[j] == a) {
                    pos = j;
                }else if(ball[j] ==b) {
                    pos2 = j;
                }      
            }
            int temp = ball[pos];
            ball[pos] = ball[pos2];
            ball[pos2] = temp;
            
        }
        
        System.out.println(ball[1]);
        
    }
}