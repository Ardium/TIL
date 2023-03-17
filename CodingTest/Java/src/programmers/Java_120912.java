package programmers;

/*
 * Question: 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 
 *           정수 배열 array가 매개변수로 주어질 때, 
 *           7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
 * Restrictions: 
 *  * 1 <= array의 길이 <= 100
 *  * 0 <= array의 원소 <= 100,000
 * Input/Output:
 *  * Case 1: Input = [7, 77, 17] → Output = 4
 *  * Case 2: Input = [10, 29] → Output = 0
 */
public class Java_120912 {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int obj : array) {
            String strObj = Integer.toString(obj);

            for(int i = 0; i < strObj.length(); i++) {
                if(strObj.charAt(i) == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}