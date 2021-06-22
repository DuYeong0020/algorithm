import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = br.readLine();
            map.put(arr[i], i);
        }
        while (m-- > 0) {
            String input = br.readLine();
            if ('0' <= input.charAt(0) && input.charAt(0) <= '9')
                sb.append(arr[Integer.parseInt(input)] + "\n");
            else
                sb.append(map.get(input) + "\n");
        }
        System.out.print(sb);
    }
}