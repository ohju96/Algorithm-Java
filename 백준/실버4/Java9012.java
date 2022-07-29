package 백준.실버4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Java9012 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 데이터 수를 나타내는 정수 T

        // 데이터 수 만큼 반복하기
        for (int i = 0; i < T; i++) {

            String s = br.readLine();

            // 문자열의 각 자리를 char 형태로 바꿔서 체크한다. 때문에 stack 또한 char 형으로 변경
            Stack<Character> stack = new Stack<Character>();

            // 문자열의 각 자리를 비교한다.
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    stack.push(s.charAt(j));
                } else {

                    // 값을 빼기 전에 값이 비어있는지 체크
                    if (stack.empty()) {
                        stack.push(s.charAt(j));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            // 상황에 맞게 값을 출력
            if (stack.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
