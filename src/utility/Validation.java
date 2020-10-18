package utility;

public class Validation {

	public boolean checkAccess(String username, String password) {
		// TODO Auto-generated method stub
		if(username.equalsIgnoreCase("Administrator")&&password.equalsIgnoreCase("Administrator@123"))
			{
			return true;
	}
	else{
		return false;
	}
		
	}
	

}
