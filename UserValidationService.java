package webapp;

public class UserValidationService {

	

	public boolean isValidUser(String user, String password) {
		if(user.equals("Elvis") && password.equals("password")){
			return true;
		}
		else {
			return false;
		}
	
	}
}
