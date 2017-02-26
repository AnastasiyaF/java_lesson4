package com.epam.java_training.ls4.task2;

import com.epam.java_training.ls4.util.Util;

public class RunTask2 {
	public static void runTask(){
		
		int k = 0;
		
		Util.printBegin(2);
		
		k = Util.enterValueWithRandom(6);
		
		Fraction[] fraction_massive = new Fraction[k];
		
		
		for (int i = 0; i < fraction_massive.length; i++){
			fraction_massive[i] = new Fraction(Util.enterValueWithRandom(10), Util.enterValueWithRandom(15));
			fraction_massive[i].printFraction();
		}
		
		Util.printEnd(2);
	}
}
