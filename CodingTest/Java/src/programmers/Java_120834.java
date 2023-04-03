package programmers;

/*
 * Question Number: 120834
 * Question: 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
 *           입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. 
 *           a는 0, b는 1, c는 2, ..., j는 9입니다. 
 *           예를 들어 23살은 cd, 51살은 fb로 표현합니다. 
 *           나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요. 
 * Restrictions: 
 *  * age는 자연수입니다.
 *  * age ≤ 1,000
 *  * PROGRAMMERS-962 행성은 알파벳 소문자만 사용합니다.
 * Input/Output:
 *  * Case 1: Input = 23 → Output = "cd"
 *  * Case 2: Input = 51 → Output = "fb"
 *  * Case 3: Input = 100 → Output = "baa"
 */
public class Java_120834 {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                answer += "a";
            }
            else if(str.charAt(i) == '1') {
                answer += "b";
            }
            else if(str.charAt(i) == '2') {
                answer += "c";
            }
            else if(str.charAt(i) == '3') {
                answer += "d";
            }
            else if(str.charAt(i) == '4') {
                answer += "e";
            }
            else if(str.charAt(i) == '5') {
                answer += "f";
            }
            else if(str.charAt(i) == '6') {
                answer += "g";
            }
            else if(str.charAt(i) == '7') {
                answer += "h";
            }
            else if(str.charAt(i) == '8') {
                answer += "i";
            }
            else if(str.charAt(i) == '9') {
                answer += "j";
            }
        }
        
        return answer;
    }
}