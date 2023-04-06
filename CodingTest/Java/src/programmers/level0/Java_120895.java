package programmers.level0;

/*
 * Question Number: 120895
 * Question: 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, 
 *           my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 * Restrictions: 
 *  * 1 < my_string의 길이 < 100
 *  * 0 ≤ num1, num2 < my_string의 길이
 *  * my_string은 소문자로 이루어져 있습니다.
 *  * num1 ≠ num2
 * Input/Output:
 *  * Case 1: Input = "hello" / 1 / 2 → Output = "hlelo"
 *  * Case 2: Input = "I love you" / 3 / 6 → Output = "I l veoyou"
 */
public class Java_120895 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        int index_small = num1 > num2 ? num2 : num1;
        int index_big = num1 > num2 ? num1 : num2;

        for(int i = 0; i < my_string.length(); i++) {
            String letter = String.valueOf(my_string.charAt(i));
            if(i == index_small) {
                answer += String.valueOf(my_string.charAt(index_big));
            }
            else if(i == index_big) {
                answer += String.valueOf(my_string.charAt(index_small));
            }
            else {
                answer += letter;
            }
        }

        return answer;
    }
}