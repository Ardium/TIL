package programmers.level0;

/*
 * Question Number: 120838
 * Question: 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
 *           그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 
 *           문자열 letter가 매개변수로 주어질 때, 
 *           letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 *           모스부호는 다음과 같습니다. 
 * morse = { 
               '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
               '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
               '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
               '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
               '-.--':'y','--..':'z'
           }
 * Restrictions: 
 *  * 1 ≤ letter의 길이 ≤ 1,000
 *  * return값은 소문자입니다.
 *  * letter의 모스부호는 공백으로 나누어져 있습니다.
 *  * letter에 공백은 연속으로 두 개 이상 존재하지 않습니다.
 *  * 해독할 수 없는 편지는 주어지지 않습니다.
 *  * 편지의 시작과 끝에는 공백이 없습니다.
 * Input/Output:
 *  * Case 1: Input = ".... . .-.. .-.. ---" → Output = "hello"
 *  * Case 2: Input = ".--. -.-- - .... --- -." → Output = "python"
 */
public class Java_120838 {
    public String solution(String letter) {
        String answer = "";
        String [] strl = letter.split(" ");

        for(int i = 0; i < strl.length; i++) {
            switch(strl[i]) {
                case ".-":
                    answer += "a";
                    break;
                case "-...":
                    answer += "b";
                    break;
                case "-.-.":
                    answer += "c";
                    break;
                case "-..":
                    answer += "d";
                    break;
                case ".":
                    answer += "e";
                    break;
                case "..-.":
                    answer += "f";
                    break;
                case "--.":
                    answer += "g";
                    break;
                case "....":
                    answer += "h";
                    break;
                case "..":
                    answer += "i";
                    break;
                case ".---":
                    answer += "j";
                    break;
                case "-.-":
                    answer += "k";
                    break;
                case ".-..":
                    answer += "l";
                    break;
                case "--":
                    answer += "m";
                    break;
                case "-.":
                    answer += "n";
                    break;
                case "---":
                    answer += "o";
                    break;
                case ".--.":
                    answer += "p";
                    break;
                case "--.-":
                    answer += "q";
                    break;
                case ".-.":
                    answer += "r";
                    break;
                case "...":
                    answer += "s";
                    break;
                case "-":
                    answer += "t";
                    break;
                case "..-":
                    answer += "u";
                    break;
                case "...-":
                    answer += "v";
                    break;
                case ".--":
                    answer += "w";
                    break;
                case "-..-":
                    answer += "x";
                    break;
                case "-.--":
                    answer += "y";
                    break;
                case "--..":
                    answer += "z";
                    break;                
            }
        }

        return answer;
    }
}