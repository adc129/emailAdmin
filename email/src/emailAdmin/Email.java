package emailAdmin;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName; 
	private String password; 
	private String email;
	private String department;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail; 
	private String companySuffix = "company.com";
	
	// Constructor to receive first and last name 
	public Email(String firstName, String lastName) {
		this.firstName = firstName; 
		this.lastName = lastName; 
		
		// call method asking for department then return department 
		this.department = setDepartment();

		
		// call a method that returns a random password 
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

	}
	
	// Ask for department 
	private String setDepartment() {
		System.out.print("New employee " + firstName + ", Enter the department:\n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\nEnter department code:");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		
		if(deptChoice == 1) {
			return "sales";
		} else if(deptChoice == 2 ){
			return "dev";	
		}else if(deptChoice == 2 ){
			return "acct";	
		}else{
			return "";	
		}
	}
	
	//Generate random password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&";
		char[] password = new char[length];
		
		for(int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password); 
	}
	
	// Set mailbox capacity 
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set alternate email 
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	
	// Change password 
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity(){
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail; 
	}
	
	public String getPassword() { 
		return password;
	}
	
	public String showInfo() {
		return "Display name: " + firstName + " " + lastName +
				"\nCompany email: " + email +
				"\nMailbox capacity: " + mailboxCapacity + "mbs";
		}
}
