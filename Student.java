package Information;

import java.util.Scanner;

public class Student {
	String name;
	String sex;
	int age;
	String stuNo;
	private Scanner reader0;

public void inputInformation() {
	Scanner reader = new Scanner(System.in);
		a:for(;;) {
			try {
				System.out.println("����������:  ");
		        name=reader.nextLine();
		        System.out.println("¼��ɹ�~");
		        break a;
			}
			catch(Exception e) {
				System.out.println("������� ��"+name+"�� ��ʽ����ȷ�����������룡");
			}
		}
		b:for(;;) {
		try{
		System.out.println("�������Ա�:  ");
		sex=reader.nextLine();
		sexJudge(sex);
		break b;
		}
		catch(Judge e) {
			System.out.println(e.JudgeException(sex));
		}
		}
		c:for(;;) {
			try{
				System.out.println("����������:  ");
				age=reader.nextInt();
			    ageJudge(age);
			    break c;
			}
			catch(Judge e) {
				System.out.println(e.JudgeException(age));
			}
			}
	
	d:for(;;) {
		try {
			Scanner reader0 = new Scanner(System.in);
			System.out.println("������ѧ��");
			stuNo=reader0.nextLine();
	        System.out.println("¼��ɹ�~");
	        break d;
		}
		catch(Exception e) {
			System.out.println("������ġ�"+stuNo+"����ʽ����ȷ�����������룡");
		}
	}
	
}
public void sexJudge(String sex) throws Judge{
	String x="��";
	String y="Ů";
	if (sex.equals(x)||sex.equals(y)){
		System.out.println("¼��ɹ�~");
		}
	else throw new Judge();
}
public void ageJudge(int age) throws Judge{
	int x=0;
	int y=100;
	if (age>=x&&age<=y){
		System.out.println("¼��ɹ�~");
		}
	else throw new Judge();
}

}
