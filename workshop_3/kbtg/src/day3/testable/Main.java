package day3.testable;

public class Main {

	public static void main(String[] args) {

		AuthenticationProcess p = 
				new AuthenticationProcess();
		try {
			p.process("", "");
			
		} catch(LdapUserNotFoundException e) {
			throw new BusinessException(100, "Case 100");
		} catch(NullPointerException e) {
			throw new BusinessException(200, "Case 200");
		} catch(RuntimeException e) {
			throw new BusinessException(300, "Case 300");
		}
		
	}

}
