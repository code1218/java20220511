package j17_최상위클래스;

import java.util.Objects;

public class User {
	private int usercode;
	private String username;
	private String password;
	private String name;
	private String email;
	
	public User(int usercode, String username, String password, String name, String email) {
		super();
		this.usercode = usercode;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	public int getUsercode() {
		return usercode;
	}

	public void setUsercode(int usercode) {
		this.usercode = usercode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(email, name, password, usercode, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return this.hashCode() == obj.hashCode();
	}

	@Override
	public String toString() {
		return "User [usercode=" + usercode + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", email=" + email + "]";
	}
}








