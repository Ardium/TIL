package programmers.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Question Number: 120812
 * Question: 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
 *           정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 
 *           최빈값이 여러 개면 -1을 return 합니다.
 * Restrictions: 
 *  * 0 < array의 길이 < 100
 *  * 0 ≤ array의 원소 < 1000
 * Input/Output:
 *  * Case 1: Input = [1, 2, 3, 3, 3, 4] → Output = 3
 *  * Case 2: Input = [1, 1, 2, 2] → Output = -1
 *  * Case 3: Input = [1] → Output = 1
 */
public class Java_120812 {
    public int solution(int[] array) {
        Arrays.sort(array);

        Map<Integer, Integer> map = new HashMap<>();
        int frequency = 0;
        int target = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] == target) {
                frequency++;

                if(i == array.length - 1) {
                    map.put(target, frequency);
                }
            }
            else {
                map.put(target, frequency);
                target = array[i];
                frequency = 0;
                i--;
            }
        }

        int answer = 0;
        int maxFrequency = 0;
        for(int key : map.keySet()) {
            if(map.get(key) > maxFrequency) {
                maxFrequency = map.get(key);
                answer = key;
            }
            else if(map.get(key) == maxFrequency) {
                answer = -1;
            }
        }
        return answer;
    }
}