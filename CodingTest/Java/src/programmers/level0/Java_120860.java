package programmers.level0;

/*
 * Question Number: 120860
 * Question: 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 
 *           직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 
 *           직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
 * Restrictions: 
 *  * dots의 길이 = 4
 *  * dots의 원소의 길이 = 2
 *  * -256 < dots[i]의 원소 < 256
 *  * 잘못된 입력은 주어지지 않습니다.
 * Input/Output:
 *  * Case 1: Input = [[1, 1], [2, 1], [2, 2], [1, 2]] → Output = 1
 *  * Case 2: Input = [[-1, -1], [1, 1], [1, -1], [-1, 1]] → Output = 4
 */
public class Java_120860 {
    public int solution(int[][] dots) {
        int row_length = -1;
        int col_length = -1;

        int row_dot = dots[0][0];
        int col_dot = dots[0][1];
        for(int i = 1; i < dots.length - 1; i++) {
            if(dots[i][0] != row_dot) {
                row_length = dots[i][0] > row_dot ? dots[i][0] - row_dot : row_dot - dots[i][0];
            }
            if(dots[i][1] != col_dot) {
                col_length = dots[i][1] > col_dot ? dots[i][1] - col_dot : col_dot - dots[i][1];
            }
        }

        return row_length * col_length;
    }
}