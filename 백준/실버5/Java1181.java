package 백준.실버5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Java1181 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 단어의 개수
        String[] result = new String[N]; // 단어

        for (int i = 0; i < N; i++) {
            result[i] = br.readLine();
        }

        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                // 단어 길이가 같다면
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else { // 같지 않다면
                    return o1.length() - o2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(result[0]).append('\n');

        for (int i = 1; i < N; i++) {
            // 중복 되지 않은 단어만 출력
            if (!result[i].equals(result[i - 1])) {
                sb.append(result[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
