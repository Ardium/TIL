package programmers.level0;

/*
 * Question Number: 120884
 * Question: 프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다. 
 *           쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다. 
 *           시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.
 * Restrictions: 
 *  * chicken은 정수입니다.
 *  * 0 ≤ chicken ≤ 1,000,000
 * Input/Output:
 *  * Case 1: Input = 100 → Output = 11
 *  * Case 2: Input = 1081 → Output = 120
 */
public class Java_120884 {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;

        while(chicken >= 10) {
            answer += chicken / 10;
            coupon += chicken % 10;
            chicken /= 10;

            if(coupon >= 10) {
                int new_chicken = coupon / 10;
                answer += new_chicken;
                chicken += new_chicken;
                coupon -= 10 * new_chicken;
            }
        }
        coupon += chicken;
        if(coupon >= 10) {
            answer += coupon / 10;
        }

        return answer;
    }
}