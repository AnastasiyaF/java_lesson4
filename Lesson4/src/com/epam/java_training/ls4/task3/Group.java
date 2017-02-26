/*
 * Задание 3.
 * Оценки, полученные студентами в сессию, являются атрибутами класса Student. Определить:
а) средний балл учебной группы (использовать класс Group);
б) средний балл каждого студента;
в) число отличников;
г) количество студентов, имеющих "2".

Date: 20/02/2017
Author: Anastasiya Findziukevich
 */

package com.epam.java_training.ls4.task3;

import java.util.ArrayList;


public class Group {
	
	private ArrayList<Student> students;
	
	public Group(){
		students = new ArrayList<Student>();
	}
	
	public void addStudent(Student student){
		
		students.add(student);
	}
	
	public double calculateAverageRate(){
		double result = 0;
		int count_rates = 0;
		double sum_rates = 0;
		
		for (Student object: this.students) {
			sum_rates = sum_rates + object.getAllSumRate();
		}
		
		count_rates = 3*students.size();

		result = sum_rates/count_rates;
		
		return result;
		
	}
	
	public void printStudents(){
		
		double average_rate = 0;
		
		for (Student object: this.students) {
			object.printStudent();
			
			average_rate = object.getAverageRate();
			System.out.println("Средний бал равен = " + average_rate + "\n");
		}
		
	}
	
	public int countStudentsHas5(){
		int count_student = 0;
		
		for (Student object: this.students) {
			if (object.checkAll5Rates() == true){
				count_student = count_student + 1;
			}
		}
		
		return count_student;
		
	}
	
	public int countStudentsHas2(){
		
		int count_student = 0;
		
		for (Student object: this.students) {
			if (object.check2Rates() == true){
				count_student = count_student + 1;
			}
		}
		
		return count_student;
		
	}
	
	public void initializeGroupTestData(){
		Student student_1 = new Student("Иванов_1", "Иван_1", 5,4,5);
		addStudent(student_1);
		
		Student student_2 = new Student("Иванов_2", "Иван_2", 3,2,5);
		addStudent(student_2);
		
		Student student_3 = new Student("Иванов_3", "Иван_3", 5,5,5);
		addStudent(student_3);
		
		Student student_4 = new Student("Иванов_4", "Иван_4", 5,2,5);
		addStudent(student_4);
	}

}
