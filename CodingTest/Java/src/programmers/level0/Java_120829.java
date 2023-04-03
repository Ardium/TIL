package programmers.level0;

/*
 * Question Number: 120829
 * Question: 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다. 
 *           각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
 *           - 예각 : 0 < angle < 90
 *           - 직각 : angle = 90
 *           - 둔각 : 90 < angle < 180
 *           - 평각 : angle = 180
 * Restrictions: 
 *  * 0 < angle ≤ 180
 *  * angle은 정수입니다.
 * Input/Output:
 *  * Case 1: Input = 70 → Output = 1
 *  * Case 2: Input = 91 → Output = 3
 */
public class Java_120829 {
    public int solution(int angle) {
        int answer = 0;
        
        if(0 < angle && angle < 90) {
            answer = 1;
        }
        else if(angle == 90) {
            answer = 2;
        }
        else if(90 < angle && angle < 180) {
            answer = 3;
        }
        else if(angle == 180) {
            answer = 4;
        }
        
        return answer;
    }
}