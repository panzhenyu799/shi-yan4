package Information;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	static Student student0=new Student();
	
	static Abnormal file = new Abnormal();
	public static void main(String[] args) {
		
		System.out.println("                               ");
		System.out.println("**********ѧ����Ϣ¼��**********");
		student0.inputInformation(); 
		System.out.println("\n\n������Ϣ��");
		System.out.println("���� �Ա� ����       ѧ��    ");
		System.out.println(student0.name+"   "+student0.sex+"    "+student0.age+"    "+student0.stuNo);
		
		String a=file.readFile();
		String b = file.operationFile(a);
		if(file.outFile(addNewInformation(student0)))
		System.out.println("��Ϣ����ɹ���");
		if(file.outFile(b))
		System.out.println("��ҵ����ɹ���");

	
	StringBuffer s=new StringBuffer(b);
	  a:
	            while (true) {
	                System.out.println("���빦�ܱ��:" + "\n" + "1:��ѯ��ʫ�е��ֻ��"+" \n"+ "2:�˳�����"+"\n");
	                Scanner o = new Scanner(System.in);
	                int m = o.nextInt();
	                switch (m) {
	                    case 1:
	                        System.out.println("��������Ҫ��ѯ���ֻ��: ");
	                        Scanner scanner1 = new Scanner(System.in);
	                        String s1 = scanner1.nextLine();
	                        Pattern pattern = Pattern.compile(s1);
	                        Matcher matcher = pattern.matcher(s);
	                        if (matcher.find()) {
	                            int num = 1;
	                            while (matcher.find()) {
	                                num++;
	                            }
	                            System.out.println("���ִ���Ϊ: " + num);
	                        } else {
	                            System.out.println("�ı���û�и��ַ�");
	                        }
	                        break;
	                    case 2:
	                        break a;
	                    default:
	                        System.out.println("������ı����������������");
	                }
	            }
}
	 
	public static String addNewInformation(Student student)
	{
		String information = null;
		information="������Ϣ��\n���� �Ա� ����       ѧ��    \n"+student0.name+"   "+student0.sex+"    "+student0.age+"    "+student0.stuNo+"\n�����ҵ��\n";
		 return information;
	}
}

	
