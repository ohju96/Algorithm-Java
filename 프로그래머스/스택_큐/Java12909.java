package 프로그래머스.스택_큐;

import java.util.Stack;

public class Java12909 {
    public static void main(String[] args) {
        String s = "()()";

        boolean answer = solution(s);
        System.out.println("answer : " + answer); // true
    }

    public static boolean solution(String s) {
        boolean answer = true;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            }

            if (s.charAt(i) == ')') {
                count--;
            }
            if (count < 0) {
                break;
            }
        }

        if (count != 0) {
            answer = false;
        }

        return answer;
    }
}