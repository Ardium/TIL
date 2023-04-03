package programmers.level0;

/*
 * Question Number: 120831
 * Question: 정수 n이 주어질 때, 
 *           n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요. 
 * Restrictions: 
 *  * 0 < n ≤ 1000
 * Input/Output:
 *  * Case 1: Input = 10 → Output = 30 (2+4+6+8+10)
 *  * Case 2: Input = 4 → Output = 6 (2+4)
 */
public class Java_120831 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i <= n; i += 2) {
            answer += i;
        }
        return answer;
    }
}