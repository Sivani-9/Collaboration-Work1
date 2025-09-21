import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	private String username;
	private String phoneNo;
	private String passWord;
	A(String user,String no,String pass)
	{
		this.username=user;
		this.phoneNo=no;
		this.passWord=pass;

	}

	static boolean mu1(String u)
	{
		 if (u == null)
		{
			System.out.print("Username cannot be empty.");
		 return false; 
		}
       		 int length = u.length(); 
     		 if (length < 3 || length > 20) {
			System.out.print("Username must be between 3 and 20 characters.");
          		 return false;
      	         }
       		 for (int i = 0; i < length; i++) {
          	 	 char ch = u.charAt(i);
          	 	 if (!(Character.isLetterOrDigit(ch) || ch == '_')) {
			System.out.print("Username can only contain letters, digits, and underscore (_).");
            	   	 return false; 
           	 }
		 }
		return true;
	}
	static String mu2()
	{
		System.out.println("enter username");
		String u=sc.next();
		if(mu1(u))
		return u;
		return mu2();
		
	}

	static boolean mp1(String phone)
	{
		  if (phone == null) 
		  {
			System.out.println("Phone number cannot be empty.");
			return false;
        	  }
 
        	if (phone.length() != 10) 
		{
		System.out.println("Phone number must be exactly 10 digits.");
		return false;
		}
 
		 char first = phone.charAt(0);
    		if (!(first == '6' || first == '7' || first == '8' || first == '9')) {
		System.out.println("Phone number must start with 6, 7, 8, or 9.");
     		   return false;
   		 }
       		 for (int i = 0; i < phone.length(); i++) {
        	    if (!Character.isDigit(phone.charAt(i))) {
		   System.out.println("Phone number can only contain digits.");
             	   return false; 
          	  }
       		 }

        	return true; 
	}

	static String mp2()
	{
		System.out.println("enter phone number");
		String p=sc.next();
		if(mp1(p))
		return p;
		return mp2();
		
	}

	static boolean mw1(String password) {
    if (password == null) {
        System.out.println("Password cannot be empty.");
        return false;
    }

    if (password.length() < 8 || password.length() > 20) {
        System.out.println("Password must be between 8 and 20 characters.");
        return false;
    }

    boolean hasUpper = false;
    boolean hasLower = false;
    boolean hasDigit = false;
    boolean hasSpecial = false;

    for (int i = 0; i < password.length(); i++) {
        char ch = password.charAt(i);

        if (Character.isUpperCase(ch)) hasUpper = true;
        else if (Character.isLowerCase(ch)) hasLower = true;
        else if (Character.isDigit(ch)) hasDigit = true;
        else if ("@#$%!^&*()_+".contains(String.valueOf(ch))) hasSpecial = true;
        else if (Character.isWhitespace(ch)) {
            System.out.println("Password cannot contain spaces.");
            return false;
        }
    }

    if (!hasUpper) {
        System.out.println("Password must contain at least one uppercase letter.");
        return false;
    }

    if (!hasLower) {
        System.out.println("Password must contain at least one lowercase letter.");
        return false;
    }

    if (!hasDigit) {
        System.out.println("Password must contain at least one digit.");
        return false;
    }

    if (!hasSpecial) {
        System.out.println("Password must contain at least one special character (@#$%!^&*()_+).");
        return false;
    }

    return true; // All rules passed
}



	static String mw2()
	{
		System.out.println("enter password");
		String p=sc.next();
		if(mw1(p))
		return p;
		return mw2();
		
	}

	public static void main(String[]args)
	{		
		
		System.out.println("Sign up successful! You can now log in and start using your account.");

	}

}



class Insta
{
	static Scanner sc = new Scanner(System.in);
	private String[] user_Name = {"Sivani", "Sai Lakshmi", "Akhila"};
	private String[] password = {"Sivani@09", "SaiLakshmi@12", "Akhila@34"};
	private long[] phNo = {9876543210, 8765432109, 7654321098};
	void verify(String User_Name, String Password)
	{
	}
	public static void main(String[]args)
	{
		Insta in = new Insta();
		System.out.println("Welcome!\n1.SignUp\n2.LogIn\nEnter Your Choice Number:");
		int a = sc.nextInt();
		if(a==1)
		{
			A ob = new A(mu2(),mp2(),mw2());
			in.verify(ob.mu2(), ob.mw2());
			System.out.println("Sign up successful! You can now log in and start using your account.");

		}
		else
		{
			System.out.println("Enter User Name and Pasword");
			in.verify();
			System.out.println("You are Welcome");
		}
	}
}