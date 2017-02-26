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

public class Student {
	private String surname;
	private String name;
	
	private int first_rate;
	private int second_rate;
	private int third_rate;
	

	public Student(){
		surname = "";
		name = "";
		
		first_rate = 0;
		second_rate = 0;
		third_rate = 0;
		
	}
	
	public Student(String surname, String name, int first_rate, int second_rate, int third_rate){

		this.surname = surname;
		this.name = name;
		
		this.first_rate = first_rate;
		this.second_rate = second_rate;
		this.third_rate = third_rate;
		
	}
	
	
	public void setSurname(String surname){
		this.surname = surname;
	}
	
	public String getSurname(){
		return this.surname;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setFirst_rate(int first_rate){
		this.first_rate = first_rate;
	}
	
	public int getFirst_rate(){
		return this.first_rate;
	}
	
	public void setSecond_rate(int second_rate){
		this.second_rate = second_rate;
	}
	
	public int getSecond_rate(){
		return this.second_rate;
	}
	
	public void setThird_rate(int third_rate){
		this.third_rate = third_rate;
	}
	
	public int getThird_rate(){
		return this.third_rate;
	}
	
	public void printStudent(){
		
		System.out.println("surname = " + this.surname + ", name = " + name +
				            ", first_rate = " + first_rate + ", second_rate = " + second_rate +
				            ", third_rate = " + third_rate);
	}
	
	public double getAverageRate(){
		
		double result = 0;
		
		result = this.getAllSumRate();
		result = result/3;
		
		return result;
	}
	
	public double getAllSumRate(){
		
		double result = 0;
		
		result = this.first_rate + this.second_rate + this.third_rate;
		
		return result;
	}
	
	public boolean check2Rates(){
		
		if (this.first_rate == 2){
			return true;
		}
		
		if (this.second_rate == 2){
			return true;
		}
		
		if (this.third_rate == 2){
			return true;
		}
		
		return false;
		
	}
	
	public boolean checkAll5Rates(){
		
		if (this.first_rate != 5){
			return false;
		}
		
		if (this.second_rate != 5){
			return false;
		}
		
		if (this.third_rate != 5){
			return false;
		}
		
		return true;
	}
	
}
