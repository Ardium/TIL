package programmers;

/*
 * Question Number: 120815
 * Question: 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 
 *           피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, 
 *           n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 
 *           최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
 * Restrictions: 
 *  * 1 ≤ n ≤ 100
 * Input/Output:
 *  * Case 1: Input = 6 → Output = 1
 *  * Case 2: Input = 10 → Output = 5
 *  * Case 3: Input = 4 → Output = 2
 */
public class Java_120815 {
    public int solution(int n) {
        int piece = 1;
        
        while((n * piece) % 6 != 0) {
            piece++;
        }
        
        return (n * piece) / 6;
    }
}