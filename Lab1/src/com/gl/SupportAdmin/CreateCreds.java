package com.gl.SupportAdmin;
import com.gl.SupportAdmin.Employee;
import java.util.Scanner;
public class CreateCreds
{
public String generateEmail(Sring f_name, String l_name, String dep)
{
return f_name+l_name+"greatlearning.com";
}

public String generatePwd()
{Random r = new Random();
	String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()<>";
	for(int i=0;i<8;i++)
	{
		int in =r.nextInt(s1.length);
	System.out.println(in);
	char c =s1.charAt(in);
	System.out.println(c);
	pwd=pwd+String.valueOf(c);
	System.out.println("password: "+pwd);

	}return pwd;
}

public String genEmail
{
this.email=email;
}
	public static void main(String[] args)
	{
		
		
		CreateCreds c = new CreateCreds();
		c.generatePwd();
		

	}
}


