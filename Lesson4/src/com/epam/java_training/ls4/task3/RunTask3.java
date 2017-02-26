package com.epam.java_training.ls4.task3;

import com.epam.java_training.ls4.util.Util;

public class RunTask3 {
	public static void runTask(){
		
		double average_rates = 0;
		int count_student = 0;
		
		Util.printBegin(3);
		
		Group group_students = new Group();
		group_students.initializeGroupTestData();
		
		average_rates = group_students.calculateAverageRate();
		
		System.out.println("b) Средний бал каждого студента: ");
		group_students.printStudents();
		
		System.out.println("a) Средний бал учебной группы равен: " + average_rates);
		
		count_student = group_students.countStudentsHas5();
		
		System.out.println("c) Число отличников: " + count_student);
				
		count_student = group_students.countStudentsHas2();
		
		System.out.println("d) Количество студентов, имеющих 2: " + count_student);
			
		
		Util.printEnd(3);
	}
}
