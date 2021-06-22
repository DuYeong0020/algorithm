import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        boolean[] cup = new boolean[4];
        cup[1] = true;
        while (m-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            boolean temp = cup[first];
            cup[first] = cup[second];
            cup[second] = temp;
        }
        for (int i = 1; i < 4; i++)
            System.out.print(cup[i] ? i : "");
    }
}