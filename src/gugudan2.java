public class gugudan2 {

	public static int[] calculate(int times) {
	// �޼ҵ� ����ؼ� ������ �ٽ� ����
		int[] result = new int[9];
		for(int i = 0; i <result.length ;i++) {
		result[i] = times*(i+1);
		}
		return result;
	}
	
	public static void main(String[] args) {
	// ���� main �޼ҵ忡�� calculate �޼ҵ带 ����Ѵ�.
	
		int[] result = calculate(2);
				
		for(int i = 0; i <result.length ;i++) {
		System.out.println(result[i]); 
		}
	}
	
}
