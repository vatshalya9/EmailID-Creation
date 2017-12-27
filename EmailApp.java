package emailapp;

import java.util.Scanner;

public class EmailApp {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String companySuffix = "company.com";
	private int mailboxcapcity;
	private String alternateEmail;
	private int passwordLength;
	private int defaultPasswordLength = 5;
	
	public EmailApp(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED: "+this.firstName+" " +this.lastName);
		this.department = setDepartment();
		System.out.println("Department: "+this.department);
	//int defaultPasswordLength;
	this.password = randomPassword(defaultPasswordLength);
	System.out.println("Your Password is: "+this.password);
	
	email = firstName.toLowerCase() +"."+ lastName.toLowerCase()+"@"+ department + companySuffix;
	System.out.println("Your email is :"+email);
	}
	
	//Department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		if(depChoice == 1) { return "sales"; }
		else if(depChoice == 2) { return "dev" ;}
		else if(depChoice == 3) { return " acc" ; }
		else { return " " ; }
	}
//Generate random password
private String randomPassword(int length){
	String passwordSet = "Vatshu@1209";
	char[] password = new char[length];
	for(int i =0;i<length;i++) {
		int rand = (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
		System.out.println(rand);
		System.out.println(passwordSet.charAt(rand));
	}
	return new String(password);
	}

}
