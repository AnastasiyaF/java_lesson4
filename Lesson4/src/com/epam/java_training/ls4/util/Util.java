package com.epam.java_training.ls4.util;

import java.util.Random;

public class Util {
	
	public static void printBegin(int tasknumber){
		
		System.out.println("Task" + tasknumber +" is in progress...");
	}
	
	public static void printEnd(int tasknumber){
		
		System.out.println("Task" + tasknumber +" is completed." + "\n");
	}
	
	public static int enterValueWithRandom(int limit) {
		int a;
		Random rand = new Random();
		a = rand.nextInt(limit) + 1;
		
		return a;
	}
}
