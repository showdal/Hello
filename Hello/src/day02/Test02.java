package day02;

public class Test02 {
	public static void main(String[] a) {
		System.out.println("������ 2�� 11�� �Դϴ�.");
		String msg = "������ ";
		String month = "2�� ";
		String day = "11�� ";
		String str = "�Դϴ�.";
		System.out.print("��� : " + msg + month + day + str); //1��
		System.out.print("��� : " + msg + month + day + str); //2��
		System.out.println(); //println�� �ٹٲ� /print�� �ٹٲޤ���
		System.out.println("��� : " + msg + month + day + str); //3��
		System.out.println("��� : " + msg + month + day + str); //4��
		
		// ���� �����ϱ�
		msg = "������ ";
		day = "12�� ";
		
		System.out.println(); //println�� �ٹٲ� /print�� �ٹٲޤ���
		System.out.println("��� : " + msg + month + day + str); //3��
		System.out.println("��� : " + msg + month + day + str); //4��
	}
}
