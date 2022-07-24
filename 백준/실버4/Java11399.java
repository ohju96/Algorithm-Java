package 백준.실버4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java11399 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // ATM 대기자 수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] P = new int[N]; // ATM 대기자 수 만큼 배열 공간 할당

        // 배열에 각 대기자가 일 처리하는 시간 저장
        for (int i = 0; i < P.length; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        // 배열에 저장된 일처리 시간을 오름차순 정렬
        Arrays.sort(P);

        int totalTime = 0; // 총 시간 계산을 위한 누적 시간 즉, 대기 시간
        int sum = 0; // 총 시간

        for (int i = 0; i < N; i ++) {
            sum += totalTime + P[i]; // 총 시간
            totalTime += P[i]; // 대기 시간
        }

        System.out.println(sum); // 총 시간 출력

    }
}
