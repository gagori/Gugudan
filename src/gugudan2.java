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
		// 메소드, for문 으로 축소
		for(int i = 2; i < 10; i ++) {
			int[] result = calculate(i);
			print(result);
		}
	}
	
}
