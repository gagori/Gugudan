public class gugudan2 {

	public static int[] calculate(int times) {
	// �޼ҵ� ����ؼ� ������ �ٽ� ����
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
	// ���� main �޼ҵ忡�� �̸� ����� �� 2���� �޼ҵ带 Ȱ���Ѵ�.
		int[] result = calculate(2);
		print(result);

		int[] times3 = calculate(3);
		print(times3);
		
		int[] times4 = calculate(4);
		print(times4);
		
	}
	
}
