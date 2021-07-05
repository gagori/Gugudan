// 예제 2
// ex) 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다.

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String inputValue = scn.nextLine();
		
		String[] splitedValue = inputValue.split(",");   // ","기준으로 문자열 가르기
		
		int first = Integer.parseInt(splitedValue[0]);   //" "문자열을 숫자로 바꿔줌 ; Integer.parseInt(문자열, 진수)
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int i =1; i <= second; i++) {
			System.out.println(first*i);
		}
	}
	

}
