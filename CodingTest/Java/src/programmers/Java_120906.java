package programmers;

/*
 * Question Number: 120906
 * Question: 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요.
 * Restrictions: 
 *  * 0 ≤ n ≤ 1,000,000
 * Input/Output:
 *  * Case 1: Input = 1234 → Output = 10
 *  * Case 2: Input = 930211 → Output = 16
 */
public class Java_120906 {
    public int solution(int n) {
        int answer = 0;
        
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}