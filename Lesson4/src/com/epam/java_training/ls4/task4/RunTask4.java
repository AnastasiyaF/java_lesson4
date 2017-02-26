package com.epam.java_training.ls4.task4;

import com.epam.java_training.ls4.util.Util;

public class RunTask4 {

	public static void runTask(){
		
		int n = 10;
		int k = 8;
		
		Abiturient[] abiturients = new Abiturient[n];
		QuickSort quicksort;
		
		Util.printBegin(4);
		System.out.println("n = " + n + ", k = " + k);
		
		
		for (int i = 0; i < abiturients.length; i++){
			
			abiturients[i] = new Abiturient("Федоров_" + i, "Федор_" + i, Util.enterValueWithRandom(4), Util.enterValueWithRandom(4), Util.enterValueWithRandom(4));
			abiturients[i].printAbiturient();
		
		}
		
		quicksort = new QuickSort(abiturients);
		
		System.out.println("Количество поступивщих = " + k + ", зачислены следующие студенты: ");
		
		quicksort.runSort();
		
		abiturients = quicksort.getAbiturients();
		
		
		for (int i = 0; i < k; i++){
			abiturients[i].printAbiturient();
			
		}
		
	}
}
