package programmers.level0;

import java.util.ArrayList;
import java.util.List;

/*
 * Question Number: 120896
 * Question: 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 
 *           사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 
 *           한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 * Restrictions: 
 *  * 0 < s의 길이 < 1,000
 *  * s는 소문자로만 이루어져 있습니다.
 * Input/Output:
 *  * Case 1: Input = "abcabcadc" → Output = "d"
 *  * Case 2: Input = "abdc" → Output = "abcd"
 *  * Case 3: Input = "hello" → Output = "eho"
 */
public class Java_120896 {
    public String solution(String s) {
        List<String> strl = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            String check = String.valueOf(s.charAt(i));
            if(s.indexOf(check) == s.lastIndexOf(check)) {
                strl.add(check);
            }
            else {
                s = s.replace(check, "");
                i--;
            }
        }

        strl.sort(null);
        String answer = "";
        for(int i = 0; i < strl.size(); i++) {
            answer += strl.get(i);
        }

        return answer;
    }
}