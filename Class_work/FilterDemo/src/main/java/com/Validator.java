package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static boolean checkEmail(String email) {
		Pattern p = Pattern.compile("^([a-zA-Z0-9])+@+[a-z]+\\.+[a-z]{2,4}$");
		Matcher m = p.matcher(email);
		return m.find();
	}
}
