package programmers.level0;

/*
 * Question Number: 120844
 * Question: 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 
 *           배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
 * Restrictions: 
 *  * 3 ≤ numbers의 길이 ≤ 20
 *  * direction은 "left" 와 "right" 둘 중 하나입니다.
 * Input/Output:
 *  * Case 1: Input = [1, 2, 3] / "right" → Output = [3, 1, 2]
 *  * Case 2: Input = [4, 455, 6, 4, -1, 45, 6] / "left" → Output = [455, 6, 4, -1, 45, 6, 4]
 */
public class Java_120844 {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] answer = new int [length];

        int index = -1;
        if(direction.equals("right")) {
            index = 0;

            answer[index++] = numbers[length - 1];
            for(int i = 0; i < length - 1; i++) {
                answer[index++] = numbers[i];
            }
        }
        else {
            index = length - 1;

            answer[index--] = numbers[0];
            for(int i = length - 1; i > 0; i--) {
                answer[index--] = numbers[i];
            }
        }

        return answer;
    }
}