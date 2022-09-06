package 프로그래머스.스택_큐;

import java.util.ArrayList;

public class Java12906 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        int[] answer = solution(arr);

        for (int i = 0; i < answer.length; i++) {
            System.out.println("answer : " + answer[i]);
        }
    }

    public static int[] solution(int[] arr) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        int value = 10;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                arrayList.add(arr[i]);
                value = arr[i];
            }
        }

        return arrayList.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
