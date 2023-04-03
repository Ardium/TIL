package programmers;

/*
 * Question Number: 120913
 * Question: 문자열 my_str과 n이 매개변수로 주어질 때, 
 *           my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
 * Restrictions: 
 *  * 1 ≤ my_str의 길이 ≤ 100
 *  * 1 ≤ n ≤ my_str의 길이
 *  * my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
 * Input/Output:
 *  * Case 1: Input = "abc1Addfggg4556b" / 6 → Output = ["abc1Ad", "dfggg4", "556b"]
 *  * Case 2: Input = "abcdef123" / 3 → Output = ["abc", "def", "123"]
 */
public class Java_120913 {
    public String[] solution(String my_str, int n) {
        int total_length = my_str.length();
        int array_size = (total_length % n == 0) ? total_length / n : (total_length / n) + 1;
        String[] answer = new String [array_size];

        int index = 0;
        for(int i = 0; i < array_size; i++) {
            if(i == array_size - 1) {
                answer[i] = my_str.substring(index);
            }
            else {
                answer[i] = my_str.substring(index, index + n);
                index += n;
            }
        }

        return answer;
    }
}