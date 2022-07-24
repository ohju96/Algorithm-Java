package 백준.실버4;

import java.util.Scanner;

public class Java11047 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 동전의 종류
        int K = scanner.nextInt(); // 가치의 총 합

        int[] coin = new int[N]; // 동전의 종류만큼 저장 가능한 배열
        int count = 0; // 필요한 동전의 수

        // 동전 종류만큼 생성한 배열에 동전의 가치를 담는 반복문
        for(int i = 0; i < N; i++) {
            coin[i] = scanner.nextInt();
        }

        // 동전 종류 중 가장 큰 종류부터 반복한다.
        for (int i = N-1; i >= 0; i--) {
            // 동전 종류 중 가장 큰 종류가 가치의 총 합과 같아지거나 커지면 그 다음 크기의 동전과 비교를 한다.
             if (K >= coin[i]) {
                count += (K / coin[i]); // 가치의 총 합에서 큰 동전이 몇 번 빠져나갈 수 있는지 체크
                K = (K % coin[i]); // 가장 큰 동전으로 뺼 수 있을 만큼 빼고 남은 가치의 총 합
            }
        }

        System.out.println(count); // 필요한 동전의 수를 출력
    }
}
