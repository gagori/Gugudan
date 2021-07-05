
public class gugudan2 {
	public static void main(String[] args) {
		
		for(int Num = 2; Num <10; Num++ ) {
			int[] result = new int[9];
			for(int i = 0; i <result.length ;i++) {
			result[i] = Num*(i+1);
			System.out.println(result[i]); //이중 for문 ㅋㅋ 맞는듯?
			}
		}
	}
}
