package Information;

public class Judge extends Exception{
	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
	String message;
	public String JudgeException(String input) {
		message = "������ġ�"+input+"������ȷ����������ȷ�Ա�";
		return message;
	}
	
	public String JudgeException(int input) {
		message = "������ġ�"+input+"������ȷ����������ȷ���䣡";
		return message;
	}
}