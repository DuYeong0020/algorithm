import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] p = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int sum = 0;
        for (int i = 0; i < n; i++) p[i] = (sum+=p[i]);
        System.out.print(Arrays.stream(p).sum());
    }
}