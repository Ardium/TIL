package programmers.level0;

/*
 * Question Number: 1499
 * Question: 정수 n이 주어질 때, 1부터 n까지의 정수를 순서대로 담은 배열을 리턴하도록 solution 함수를 작성했습니다.
 *           이때, 코드가 올바르게 동작할 수 있도록 빈 칸을 알맞게 채워주세요.
 * Restrictions: 
 *  * 정수 n이 solution 함수의 매개변수로 주어집니다.
 *  * n은 1이상 100,000 이하인 정수입니다.
 * Input/Output:
 *  * Case 1: Input = 3 → Output = [1,2,3]
 *  * Case 2: Input = 5 → Output = [1,2,3,4,5]
 */
public class Java_1499 {
    public int[] solution(int n) {
        int[] answer = new int[n];
        for(int i=0; i<n; i++)
            // 빈 칸 입력 시작
            answer[i] = i+1;
            // 빈 칸 입력 종료
        return answer;
    }
}