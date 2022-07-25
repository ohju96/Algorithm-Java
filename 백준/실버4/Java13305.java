package 백준.실버4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java13305 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int city = Integer.parseInt(br.readLine()); // 도시의 수

        long[] road = new long[city-1]; // 도로 길이
        long[] cost = new long[city]; // 도시의 기름 비용

        // 각 도로 길이를 배열에 저장
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < city-1; i++) {
            road[i] = Long.parseLong(st.nextToken());
        }

        // 각 도시의 기름 비용을 배열에 저장
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < city; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0; // 비용의 합
        long min = cost[0]; // 최소 비용

        // 도시 건너는 반복문
        for (int i = 0; i < city-1; i++) {
            // 비용이 최소 비용보다 작으면 해당 비용을 최소 비용으로 초기화
            if (cost[i] < min) {
                min = cost[i];
            }
            // 비용 합에 누적
            sum += (min * road[i]);
        }

        // 비용 합을 출력
        System.out.println(sum);
    }
}
