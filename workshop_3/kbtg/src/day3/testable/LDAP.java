package day3.testable;

public interface LDAP {
	
	/**
	 * Check user from LDAP
	 * @param id
	 * @param password
	 * @throws exception when data not found
	 * LdapUserNotFoundException
	 */
	void checkUser(
			String id, String password) 
					throws LdapUserNotFoundException;
}
