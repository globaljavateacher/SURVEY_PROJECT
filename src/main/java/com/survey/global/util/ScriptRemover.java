package com.survey.global.util;

public class ScriptRemover {

	public static String remove(String str) {
		return str
				.replace("http", "h11p")
				.replace("script", "scr1pt")
				.replace("img", "1mg");
	}
}
