package Information;

public class Judge extends Exception{
	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
	String message;
	public String JudgeException(String input) {
		message = "您输入的“"+input+"”不正确，请输入正确性别！";
		return message;
	}
	
	public String JudgeException(int input) {
		message = "您输入的“"+input+"”不正确，请输入正确年龄！";
		return message;
	}
}