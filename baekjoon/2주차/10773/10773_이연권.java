import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int k = Integer.parseInt(br.readLine());
        while (k-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) stack.pop();
            else stack.push(n);
        }
        System.out.print(stack.isEmpty() ? 0 : stack.stream().reduce((x, y)-> x+y).get());
    }
}