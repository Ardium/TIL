package programmers.level0;

/*
 * Question Number: 120908
 * Question: 문자열 str1, str2가 매개변수로 주어집니다. 
 *           str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
 * Restrictions: 
 *  * 1 ≤ str1의 길이 ≤ 100
 *  * 1 ≤ str2의 길이 ≤ 100
 *  * 문자열은 알파벳 대문자, 소문자, 숫자로 구성되어 있습니다.
 * Input/Output:
 *  * Case 1: Input = "ab6CDE443fgh22iJKlmn1o" / "6CD" → Output = 1
 *  * Case 2: Input = "ppprrrogrammers" / "pppp" → Output = 2
 */
public class Java_120908 {
    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1: 2;
    }
}