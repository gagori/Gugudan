public class gugudanMain {
	public static void main(String[] args) { //main �޼ҵ� ; ���α׷��� �����ϴ� ���� >>������ Ŭ������ ���� �и�����.
		for(int i = 2; i < 10; i ++) {
			int[] result = gugudan2.calculate(i);   //�ٸ� class�� �޼ҵ带 ȣ���ϴ� ��� ; gugudan2.~~ Ŭ���� �̸��� �ٿ���
			gugudan2.print(result);                 // ��, class�� �빮�ڷ� ����, method�� �ҹ��� ������ ����.
		}
	}
}
