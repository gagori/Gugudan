
public class gugudan2 {
	public static void main(String[] args) {
		int[] result = new int[9];
		for(int i = 0; i <result.length ;i++) {
			result[i] = 2*(i+1);
		}
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		result = new int[9]; //result라는  배열을 계속 사용
		for(int i = 0; i <result.length ;i++) {
			result[i] = 3*(i+1);
		}
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
	}

}
