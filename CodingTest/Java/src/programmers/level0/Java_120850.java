package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Question Number: 120850
 * Question: 문자열 my_string이 매개변수로 주어질 때, 
 *           my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 
 *           solution 함수를 작성해보세요.
 * Restrictions: 
 *  * 1 ≤ my_string의 길이 ≤ 100
 *  * my_string에는 숫자가 한 개 이상 포함되어 있습니다.
 *  * my_string은 영어 소문자 또는 0부터 9까지의 숫자로 이루어져 있습니다.
 * Input/Output:
 *  * Case 1: Input = hi12392 → Output = [1, 2, 2, 3, 9]
 *  * Case 2: Input = p2o4i8gj2 → Output = [2, 2, 4, 8]
 *  * Case 2: Input = abcde0 → Output = [0]
 */
public class Java_120850 {
    public int[] solution(String my_string) {
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            char letter = my_string.charAt(i);
            if('0' <= letter && letter <= '9') {
                lst.add(Integer.parseInt(String.valueOf(letter)));
            }
        }
        int[] answer = lst.stream().mapToInt(i -> i).toArray();;
        
        Arrays.sort(answer);

        return answer;
    }
}