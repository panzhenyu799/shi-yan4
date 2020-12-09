# 计192 2019311237 潘振宇
# shi-yan4
Java课程作业项目仓库
# 阅读程序
## 实验目的
1.掌握字符串String及其方法的使用  
2.掌握文件的读取/写入方法  
3.掌握异常处理结构  
## 实验要求
在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。  
文件A包括两部分内容：  
一是学生的基本信息；  
二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：  

1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”  
2.允许提供输入参数，统计古诗中某个字或词出现的次数  
3.输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A  
4.考虑操作中可能出现的异常，在程序中设计异常处理程序  


## 实验过程
1.Student类：实例化一名学生，为其创建姓名，性别，年龄，学号等属性，用try-catch进行异常处理。  
2.Judge类：通过继承Exception异常类，友好处理student的年龄，性别异常。  
3.Abnormal类：读取文本，存在字符组中，利用循环判断达到插入“，”和“。”的目的。将生成的结果储存在另一个文本中。  
4.Test类：将学生信息打印输出，利用while循环实现字符统计字符出现次数的功能。  

## 核心方法  

1.方法1（录入学生信息，姓名，年龄，性别，学号等）
```
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

``` 

2.方法2（学生性别异常处理）
```
public void sexJudge(String sex) throws Judge{
	String x="男";
	String y="女";
	if (sex.equals(x)||sex.equals(y)){
		System.out.println("录入成功~");
		}
	else throw new Judge();
}
	   
``` 

3.方法3（学生性别，年龄异常处理）
```
public String JudgeException(String input) {
		message = "您输入的“"+input+"”不正确，请输入正确性别！";
		return message;
	}
	
	public String JudgeException(int input) {
		message = "您输入的“"+input+"”不正确，请输入正确年龄！";
		return message;
	}
}
``` 

4.统计字符串长度
```
public String operationFile(String longer) {
		String l=null;
		String s;
	    char[] a;
		for(int i = 0;i<longer.length();i=i+7) {
			 a=new char[7];
			 try {
				 longer.getChars(i, i+7, a, 0);
		       } catch( Exception ex) {
		            System.out.println("触发异常...");
		        }
```

5.读取待处理文本文件
```
public String readFile() {
		String original = null;
		int n=-1;
		char[] a = new char[100];//缓存，
		try {
			File file = new File("D:\\all\\Java\\text.txt");
			InputStream fli = new FileInputStream(file);
			InputStreamReader in = new InputStreamReader(fli, "UTF-8");
		while((n=in.read(a,0,100))!=-1) {
		String s = new String(a,0,n);
		this.n=n;
		if(original!=null)
		original = original+s;
		else original=s;
		}
		
        in.close();
      	}
		catch (IOException e) {
			System.out.println("File read erroe:"+e);
		}
		return original;
	}
```

6.生成文本文件
```
public boolean outFile(String a) {
		byte [] b = a.getBytes();
		try {
			File file = new File("D:\\all\\Java\\text1.txt");
			OutputStream out = new FileOutputStream(file,true);
			
            out.write(b);
            out.flush();
            out.close();
           
		}
		catch (IOException e) {
			System.out.println("File read erroe:"+e);
		}
		 return true;
		}
```

7.统计字符出现次数
```
	StringBuffer s=new StringBuffer(b);
	  a:
	            while (true) {
	                System.out.println("输入功能编号:" + "\n" + "1:查询古诗中的字或词"+" \n"+ "2:退出程序"+"\n");
	                Scanner o = new Scanner(System.in);
	                int m = o.nextInt();
	                switch (m) {
	                    case 1:
	                        System.out.println("输入你想要查询的字或词: ");
	                        Scanner scanner1 = new Scanner(System.in);
	                        String s1 = scanner1.nextLine();
	                        Pattern pattern = Pattern.compile(s1);
	                        Matcher matcher = pattern.matcher(s);
	                        if (matcher.find()) {
	                            int num = 1;
	                            while (matcher.find()) {
	                                num++;
	                            }
	                            System.out.println("出现次数为: " + num);
	                        } else {
	                            System.out.println("文本中没有该字符");
	                        }
	                        break;
	                    case 2:
	                        break a;
	                    default:
	                        System.out.println("您输入的编号有误，请重新输入");
	                }
	            }
 ```
## 实验结果
![1](https://github.com/panzhenyu799/shi-yan4/blob/main/1607528901(1).jpg)
![2](https://github.com/panzhenyu799/shi-yan4/blob/main/1607529009(1).jpg)
## 实验感想  
学会了string的一些基本应用，能简单的读取写入文件，以及执行一些简单的异常处理。这是最后一次实验，耗费的时间，精力也越久。确实也是将以前学到的知识及逆行了一定的整合，有了一些提升。经过了这几次实验，一方面提高了自己规范编写代码和文档的能力，改变了一些随意散漫的态度，也提高了自己分析问题，理解并解决需求的能力。最后，团队的力量是无穷的，虽然说有些东西只能靠自己，但很多时候团队的力量往往可以节约时间，从而进行高质量的任务，互相磨合，共同进步，才能发挥更大的价值。纸上得来终觉浅，绝知此事要躬行。理论知识学得再好，不去付出实践，也不会有任何进步，所以，多动手是学好编程的前提。
