public class gugudan2 {

	public static int[] calculate(int times) {
	// 메소드 사용해서 구구단 다시 구현
		int[] result = new int[9];
		for(int i = 0; i <result.length ;i++) {
		result[i] = times*(i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i <result.length ;i++) {
			System.out.println(result[i]); 
		}
	}
	
	public static void main(String[] args) {
	// 이제 main 메소드에서 미리 만들어 둔 2개의 메소드를 활용한다.
		int[] result = calculate(2);
		print(result);

		int[] times3 = calculate(3);
		print(times3);
		
		int[] times4 = calculate(4);
		print(times4);
		
	}
	
}
