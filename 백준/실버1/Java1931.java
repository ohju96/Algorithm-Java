package 백준.실버1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Java1931 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 회의 수

        // 0 = 시작 시간, 1 = 종료 시간
       int[][] time = new int[N][2];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            time[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간
        }

        // 끝나는 시간을 기준으로 정렬, compare 재정의하여 사용[참고](https://st-lab.tistory.com/243)
        Arrays.sort(time, new Comparator<int[]>() {

            // 메서드 재정의
            @Override
            public int compare(int[] o1, int[] o2) {

                // 종료 시간이 같다면 시작 시간이 빠른 순으로 정렬
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[1];
                }

                return o1[1] - o2[1];
            }
        });

        int count = 0; // 회의 최대 개수
        int endTime = 0; // 회의 종료 시간

        // 회의 수 만큼 반복
        for (int i = 0; i < N; i++) {

            // 회의 종료 시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
            if (endTime <= time[i][0]) {
                endTime = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
