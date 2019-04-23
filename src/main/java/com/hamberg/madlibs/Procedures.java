package com.hamberg.madlibs;

import java.util.Scanner;

public class Procedures {

	private String[] types = {"an ajective not ending in 'ly'", 
			"something that you do to a thing",  "a number", 
			"an animal in plural form", "a place", 
			"an adjective that ends with 'ly'", "a past tense verb",
			"an adjective not ending in 'ly'", "a noun"};
	private String[] udata = new String[types.length];
	
	protected void prompt() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < types.length; i++) {
			System.out.format("Enter %s: \n> ", types[i]);
			String choice = scanner.nextLine();
			setUdata(choice, i);
		}
		scanner.close();
	}
	
	private void setUdata(String element, int i) {
		this.udata[i] = element;
	}
	
	protected String[] getUdata() {
		return this.udata;
	}
	
}
