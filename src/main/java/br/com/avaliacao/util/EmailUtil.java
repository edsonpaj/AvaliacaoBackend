package br.com.avaliacao.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailUtil {
	
	private static final String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+↵\n)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	
	public static boolean emailValido(String email) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

}
