package programmers;

/*
 * Question Number: 120904
 * Question: 정수 num과 k가 매개변수로 주어질 때, 
 *           num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 
 *           없으면 -1을 return 하도록 solution 함수를 완성해보세요.
 * Restrictions: 
 *  * 0 < num < 1,000,000
 *  * 0 ≤ k < 10
 *  * num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다
 * Input/Output:
 *  * Case 1: Input = 29183  / 1 → Output = 3
 *  * Case 1: Input = 232443 / 4 → Output = 4
 *  * Case 1: Input = 123456 / 7 → Output = -1
 */
public class Java_120904 {
    public int solution(int num, int k) {
        int answer = -1;

        String str = String.valueOf(num);
        for(int i = 0; i < str.length(); i++) {
            if(Integer.parseInt(String.valueOf(str.charAt(i))) == k) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}