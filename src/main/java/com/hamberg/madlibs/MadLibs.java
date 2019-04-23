package com.hamberg.madlibs;

import com.hamberg.madlibs.Procedures;

public class MadLibs {
	
	public static void main(String[] args) {
		// Simple madlib prototype
		Procedures procs = new Procedures();
	    procs.prompt();
	    System.out.format("MadLib: \n" +
	    		"The %s farmer %s %s %s on his farm in " +
				"%s before he %s %s with his %s %s.", 
				procs.getUdata());
	}

}
