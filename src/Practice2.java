// ���� 2
// ex) ����ڰ� "8,7"�� ���� ���ڿ��� �Է��ϸ� ��ĥ���� �����Ѵ�.

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String inputValue = scn.nextLine();
		
		String[] splitedValue = inputValue.split(",");   // ","�������� ���ڿ� ������
		
		int first = Integer.parseInt(splitedValue[0]);   //" "���ڿ��� ���ڷ� �ٲ��� ; Integer.parseInt(���ڿ�, ����)
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int i =1; i <= second; i++) {
			System.out.println(first*i);
		}
	}
	

}
