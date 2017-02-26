package com.epam.java_training.ls4.task1;

import java.util.Scanner;

import com.epam.java_training.ls4.util.Util;

public class RunTask1 {
	public static void printQuestions(){
		System.out.println("Введите номер 1-3 для отображения следующей информации:");
		System.out.println(" 1 - полные данные.");
		System.out.println("2 - ФИО.");
		System.out.println("3 - общие сведения.");
		
	}
	
	public static void runTask(){
		int number_case = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		Util.printBegin(1);
		Student student_1 = new Student(1, "Иванов", "Иван", "Иванович", "01/10/1996", "ул. Почтовая, д. 5, кв. 10", "+375293002030",
				                       "Информационные технологии", 5);
		
		System.out.println("Student is created.");
		
		printQuestions();
		
		number_case = scanner.nextInt();
		student_1.showDetails(number_case);
		
		
		Customer customer_1 = new Customer(1, "Федоров", "Федор", "Федорович", "ул. Почтовая, д. 5, кв. 10", "9999-0101-0987-1980");
		
		System.out.println("Customer is created.");
		
		printQuestions();
		customer_1.showDetails(number_case);
		
		number_case = scanner.nextInt();
		customer_1.showDetails(number_case);
		
		Util.printEnd(1);
		
		scanner.close();
	}
}
