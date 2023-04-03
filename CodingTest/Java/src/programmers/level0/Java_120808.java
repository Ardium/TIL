package programmers.level0;

/*
 * Question Number: 120808
 * Question: 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 
 *           두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 
 *           두 분수를 더한 값을 기약 분수로 나타냈을 때 
 *           분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 * Restrictions: 
 *  * 0 <numer1, denom1, numer2, denom2 < 1,000
 * Input/Output:
 *  * Case 1: Input = 1 / 2 / 3/ / 4 → Output = [5, 4]
 *  * Case 2: Input = 9 / 2 / 1 / 3 → Output = [29, 6]
 */
public class Java_120808 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom3 = denom1 * denom2;
        int numer3 = numer1 * denom2 + numer2 * denom1;
        int min = denom3 < numer3 ? denom3 : numer3;
        
        for(int i = min; i > 1; i--) {
            if(numer3 % i == 0 && denom3 % i == 0) {
                numer3 /= i;
                denom3 /= i;
            }
        }
        
        int[] answer = {numer3, denom3};
        return answer;
    }
}