package 백준.실버4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine()); // K 개의 줄
        int[] arr = new int[K];
        int top = -1; // 마지막 원소 위치
        int sum = 0; // 최종 합

        // 각 줄에 값을 입력 받으면서 0일 경우 원소 위치를 하나씩 당겨서 담는다.
        for (int i = 0; i < K; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                top--;
            } else {
                top++;
                arr[top] = number;
            }
        }

        for (int i = 0; i <= top; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
