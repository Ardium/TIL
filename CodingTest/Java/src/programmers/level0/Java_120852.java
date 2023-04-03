package programmers.level0;

import java.util.ArrayList;
import java.util.List;

/*
 * Question Number: 120852
 * Question: 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 
 *           예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 
 *           따라서 12의 소인수는 2와 3입니다. 
 *           자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 * Restrictions: 
 *  * 2 ≤ n ≤ 10,000
 * Input/Output:
 *  * Case 1: Input = 12 → Output = [2, 3]
 *  * Case 2: Input = 17 → Output = [17]
 *  * Case 2: Input = 420 → Output = [2, 3, 5, 7]
 */
public class Java_120852 {
    public int[] solution(int n) {
        List<Integer> lst = new ArrayList<>();
        
        int share = 2;
        while(n > 1) {
            if(n % share == 0) {
                n /= share;
                lst.add(share);
            }
            else {
                share++;
            }
        }

        int[] answer = lst.stream().distinct().mapToInt(i -> i).toArray();
        return answer;
    }
}