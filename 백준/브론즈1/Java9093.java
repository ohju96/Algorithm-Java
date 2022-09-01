package 백준.브론즈1;

import java.io.*;
import java.util.Stack;

public class Java9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());// 테스트 케이스

        Stack<Character> stack = new Stack<Character>();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (num-- > 0) {
            String input = br.readLine() + "\n";

            for (char ch : input.toCharArray()) {
                if (ch == ' ' || ch == '\n') {
                    while (!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(ch);
                }
                else {
                    stack.push(ch);
                }
            }
        }
        bw.flush();
    }
}
