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
				System.out.println("请输入姓名:  ");
		        name=reader.nextLine();
		        System.out.println("录入成功~");
		        break a;
			}
			catch(Exception e) {
				System.out.println("您输入的 “"+name+"” 格式不正确，请重新输入！");
			}
		}
		b:for(;;) {
		try{
		System.out.println("请输入性别:  ");
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
				System.out.println("请输入年龄:  ");
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
			System.out.println("请输入学号");
			stuNo=reader0.nextLine();
	        System.out.println("录入成功~");
	        break d;
		}
		catch(Exception e) {
			System.out.println("您输入的“"+stuNo+"”格式不正确，请重新输入！");
		}
	}
	
}
public void sexJudge(String sex) throws Judge{
	String x="男";
	String y="女";
	if (sex.equals(x)||sex.equals(y)){
		System.out.println("录入成功~");
		}
	else throw new Judge();
}
public void ageJudge(int age) throws Judge{
	int x=0;
	int y=100;
	if (age>=x&&age<=y){
		System.out.println("录入成功~");
		}
	else throw new Judge();
}

}
