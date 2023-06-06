/*You are an IT Support Administrator and are charged with the task of creating credentials for 
new hires
You are working in a Service Provider company as IT Support Administrator. Your responsibility 
is to automate the manual login credentials generation for new employees. To achieve this, your 
application should perform the following tasks:
Your application should do the following:
a) Determine the department of the new employee (Technical, Admin, Human Resource, 
Legal)
b) Generate an email with the following syntax
firstNamelastName@department.company.com
c) Generate a random password which will contain (number, capital letter, small letter & 
special character)
d) Display the generated credentials
e) Use parameterized constructor of class Employee, to pass firstName, lastName.
f) Create a separate CredentialService which will have generatePassword, 
generateEmailAddress, & showCredentials method.
Sample output
Dear Harshit your generated credentials are as follows
Email ---> harshitchoudary@tech.abc.com
Password ---> 181E@wFT
*/

package com.gl.SupportAdmin;

public class Employee {
	private String f_name;
	private String l_name;
	private String email;
	private String pwd;
	
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Employee()
	{
	super();
	}
		
}
	


