package 백준.실버2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1541 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // -를 기준으로 먼저 문자열을 나눠준다.
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        // 최대 값을 저장해 둔다.
        long result = Integer.MAX_VALUE;

        // st에 토큰이 없을 때 까지 반복
        while (st.hasMoreTokens()) {

            // - 기준으로 자른 문자열을 계산하고 값을 담아둘 temp를 초기화 해둔다.
            int temp = 0;

            // +를 기준으로 나눠준다.
            StringTokenizer str = new StringTokenizer(st.nextToken(), "+");

            // str에 토큰이 없을 때 까지 반복
            while (str.hasMoreTokens()) {
                // temp에 각 토큰 값을 누적 더해준다.
                temp += Integer.parseInt(str.nextToken());
            }

            // 최대 값과 같으면 최대 값을 반환, 그렇지 않다면 temp 값을 반환한다.
            if (result == Integer.MAX_VALUE) {
                result = temp;
            } else {
                result -= temp;
            }
            System.out.println(result);
        }
    }
}
