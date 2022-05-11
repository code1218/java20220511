package j17_최상위클래스.repository;

import j17_최상위클래스.repository.user.User;

public class UserArray {
	private User[] userArray;
	
	public UserArray() {
		userArray = new User[0];
	}
	
	private void userArraySizeUp() {
		User[] tempuserArray = new User[userArray.length + 1];
		for(int i = 0; i < userArray.length; i++) {
			tempuserArray[i] = userArray[i];
		}
		userArray = tempuserArray;
	}
	
	public void add(User user) {
		userArraySizeUp();
		userArray[userArray.length - 1] = user;
	}

	public User[] getuserArray() {
		return userArray;
	}
	
	
	
}
