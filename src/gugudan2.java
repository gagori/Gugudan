public class gugudan2 {
	public static int[] calculate(int times) { //로직을 구성하는 메소드
		int[] result = new int[9];
		for(int i = 0; i <result.length ;i++) {
		result[i] = times*(i+1);
		}
		return result;
	}
	
	public static void print(int[] result) { //로직을 구성하는 메소드
		for(int i = 0; i <result.length ;i++) {
			System.out.println(result[i]); 
		}
	}
	
	
	
	}
	
