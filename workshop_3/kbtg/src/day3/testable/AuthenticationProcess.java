package day3.testable;

public class AuthenticationProcess {

	public void setDb(DB db) {
		this.db = db;
	}

	public void setLdap(LDAP ldap) {
		this.ldap = ldap;
	}

	private LDAP ldap;
	private DB db;

	// Main business process
	public Profile process(String id, String password) {
		ldap.checkUser(id, password);
		Profile profile = db.inquiryById(id);
		return profile;
	}

}
