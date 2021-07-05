public class gugudanMain {
	public static void main(String[] args) { //main 메소드 ; 프로그램을 실행하는 역할 >>별도의 클래스로 만들어서 분리하자.
		for(int i = 2; i < 10; i ++) {
			int[] result = gugudan2.calculate(i);   //다른 class의 메소드를 호출하는 방법 ; gugudan2.~~ 클래스 이름을 붙여줌
			gugudan2.print(result);                 // 단, class는 대문자로 시작, method는 소문자 시작이 국룰.
		}
	}
}
