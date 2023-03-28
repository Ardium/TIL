package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Question Number: 120897
 * Question: 정수 n이 매개변수로 주어질 때, 
 *            n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요. 
 * Restrictions: 
 *  * 1 ≤ n ≤ 10,000
 * Input/Output:
 *  * Case 1: Input = 24 → Output = [1, 2, 3, 4, 6, 8, 12, 24]
 *  * Case 2: Input = 29 → Output = [1, 29]
 *  * Case 3: Input = 9  → Output = [1, 3, 9]
 */
public class Java_120897 {
    public int[] solution(int n) {
        List<Integer> lst = new ArrayList<>(); 
        for(int i = 1; i <= n; i++) {
            int share = n / i;
            if(n % i == 0) {
                lst.add(i);

                if(i != share) {
                    lst.add(share);
                }
            }

            if(i >= share) {
                break;
            }
        }

        int [] answer = lst.stream().mapToInt(i -> i).toArray();

        Arrays.sort(answer);
        return answer;
    }
}