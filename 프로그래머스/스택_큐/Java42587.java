package 프로그래머스.스택_큐;

import java.util.Collections;
import java.util.PriorityQueue;

public class Java42587 {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        int answer = solution(priorities, location); // 1
        System.out.println("answer : " + answer);
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : priorities) {
            pq.offer(i);
        }

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (pq.peek() == priorities[i]) {
                    pq.poll();
                    answer++;
                    if (location == i){
                        return answer;
                    }
                }
            }
        }


        return answer;
    }
}
