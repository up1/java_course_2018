package day3.testable;

import static org.junit.Assert.*;

import org.junit.Test;

public class AuthenticationProcessTest { 
	
	class LDAPwithSuccess implements LDAP {
		@Override
		public void checkUser(String id, String password) {
		}
	}
	
	class LDAPwithNotFound implements LDAP {
		@Override
		public void checkUser(String id, String password) {
			throw new LdapUserNotFoundException();
		}
	}
	
	@Test
	public void success() { 
		AuthenticationProcess p = new AuthenticationProcess();
		// Property injection
		p.setLdap(new LDAPwithSuccess());
		p.setDb(new DB() {
			@Override
			public Profile inquiryById(String id) {
				Profile testProfile = new Profile();
				testProfile.setId(id);
				testProfile.setName("Test name");
				return testProfile;
			}
		});
		Profile profile = p.process("12345", "password");
		// Assert
		Profile expectedProfile = new Profile();
		expectedProfile.setId("12345");
		expectedProfile.setName("Test name");
		
		assertEquals("12345", profile.getId());
		assertEquals("Test name", profile.getName());
		assertEquals(expectedProfile, profile);
	}
	
	@Test(expected = LdapUserNotFoundException.class)
	public void throw_exception_when_data_not_found_in_LDAP() {
		AuthenticationProcess p = new AuthenticationProcess();
		p.setLdap(new LDAPwithNotFound());
		Profile profile = p.process("12345", "password");
		// Assert
		assertNull(profile);
	}
	
	@Test
	public void null_when_data_not_found_in_DB() {
		AuthenticationProcess p = new AuthenticationProcess();
		p.setLdap(new LDAPwithSuccess());
		p.setDb(new DB() {
			@Override
			public Profile inquiryById(String id) {
				return null;
			}
		});
		Profile profile = p.process("12345", "password");
		// Assert
		assertNull(profile);
	}

}
