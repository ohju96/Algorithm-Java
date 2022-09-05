package 프로그래머스.해시;

import java.util.HashSet;

public class Java1845 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};

        int answer = solution(nums);
        System.out.println("answer : " + answer); //2
    }

    public static int solution(int[] nums) {
        int answer = 0;
        int pickNums = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        if (pickNums < set.size()) {
            answer = pickNums;
        } else {
            answer = set.size();
        }

        return answer;
    }
}
