/*
 Имеется список абитуриентов (класс Abiturient) и список оценок, 
 полученных ими на вступительных экзаменах. 
 Напечатать список поступивших, если число мест меньше числа абитуриентов.

Date: 20/02/2017
Author: Anastasiya Findziukevich
 */

package com.epam.java_training.ls4.task4;

public class Abiturient {
	
	private String surname;
	private String name;
	
	private int first_rate;
	private int second_rate;
	private int third_rate;
	private int sum_rates;

	public Abiturient(){
		surname = "";
		name = "";
		
		first_rate = 0;
		second_rate = 0;
		third_rate = 0;
		sum_rates = 0;
		
	}
	
	public Abiturient(String surname, String name, int first_rate, int second_rate, int third_rate){

		this.surname = surname;
		this.name = name;
		
		this.first_rate = first_rate;
		this.second_rate = second_rate;
		this.third_rate = third_rate;
		this.sum_rates = this.getAllSumRate();
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
		this.setSum_rates();
	}
	
	public int getFirst_rate(){
		return this.first_rate;
	}
	
	public void setSecond_rate(int second_rate){
		this.second_rate = second_rate;
		this.setSum_rates();
	}
	
	public int getSecond_rate(){
		return this.second_rate;
	}
	
	public void setThird_rate(int third_rate){
		this.third_rate = third_rate;
		this.setSum_rates();
	}
	
	public int getThird_rate(){
		return this.third_rate;
	}
	
	public void printAbiturient(){
		
		System.out.println("surname = " + this.surname + ", name = " + name +
				            ", first_rate = " + first_rate + ", second_rate = " + second_rate +
				            ", third_rate = " + third_rate + ", sum_rates = " + sum_rates);
	}
	
	private int getAllSumRate(){
		
		int result = 0;
		
		result = this.first_rate + this.second_rate + this.third_rate;
		
		return result;
	}

	public int getSum_rates(){
		
		return this.sum_rates;
	}
	
	private void setSum_rates(){
		this.sum_rates = this.getAllSumRate();
	}
	
}
