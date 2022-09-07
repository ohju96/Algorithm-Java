package 프로그래머스.스택_큐;

import java.util.Arrays;

public class Java42586 {
    public static void main(String[] args) {
        int[] progresses = {93, 39, 55};
        int[] speeds = {1, 30, 5};

        int[] answer = solution(progresses, speeds);
        for (int i = 0; i < answer.length; i++) {
            System.out.println("answer : " + answer[i]);
        }
    }

    private static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int [100];
        int day = -1;

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            answer[day]++;
        }
        return Arrays.stream(answer).filter(i -> i !=0).toArray();
    }
}
