package 백준.골드4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java1034 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 행의 개수
        int M = Integer.parseInt(st.nextToken()); // 열의 개수

        String[] temp = new String[N];

        for (int i = 0; i < N; i++) {
            temp[i] = br.readLine();
        }

        int K = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>(); //가능한 행, 행 개수

        for (int i = 0; i < N; i++) {

            int count = 0; // 0의 개수 카운트

            for (int j = 0; j < M; j++) {
                count = (temp[i].charAt(j) == '0') ? count + 1 : count;
            }

            if (K >= count && count % 2 == K % 2) {
                map.put(temp[i], map.getOrDefault(temp[i], 0) + 1);
            }
        }

        // 동일 행 개수 기준으로 내림차순 정렬
        List<String> strings = new ArrayList<>(map.keySet());
        Collections.sort(strings, ((o1, o2) -> map.get(o2).compareTo(map.get(o1))));

        if (!strings.isEmpty()) {
            System.out.println(map.get(strings.get(0)));
        } else {
            System.out.println(0);
        }
    }
}
