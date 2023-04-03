package programmers.level0;

/*
 * Question Number: 7319
 * Question: 이 문제에는 표준 입력으로 정수 n이 주어집니다.
 *           별(*) 문자를 이용해 높이가 n인 삼각형을 출력해보세요.
 * Restrictions: 
 *  * n은 100 이하인 자연수입니다.
 * Input/Output:
 *  * Case 1: Input = 3 
 *          → Output = *
 *                     **
 *                     ***
 */
public class Java_7319 {
    public void solution(int n) {
        for(int row = 0; row < n; row++) {
            for(int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}