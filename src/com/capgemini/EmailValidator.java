package com.capgemini;

import java.util.regex.*;
import java.util.*;

////Email ID uc2 - check for "abc" and "bridgelabz" alongwith "@"
public class EmailValidator {

	public static String email;
	public static Scanner sc;

	public void EmailCheck(String email) {
		boolean flag = true;
		while (flag) {
			Pattern p = Pattern.compile("abc[a-zA-Z0-9._]+@bridgelabz[a-zA-Z0-9_.]+$");
			Matcher m = p.matcher(email);
			if (m.matches()) {
				System.out.println("Email id is valid!!");
				flag = false;
				break;
			} else {
				System.out.println("Email id invalid!! Enter another mail id:");
				email = sc.nextLine();

			}
		}

	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		EmailValidator user = new EmailValidator();
		System.out.println("Enter the user email id:");
		email = sc.nextLine();
		user.EmailCheck(email);
	}
}
