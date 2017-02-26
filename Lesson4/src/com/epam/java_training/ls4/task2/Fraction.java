/*
 * Задание 2.
 * Определить класс «Дробь» в виде пары m/n. 
 * Объявить массив из k дробей, ввести/вывести значения для массива дробей.
 * 
Date: 20/02/2017
Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls4.task2;

public class Fraction {
	private int numerator; // числитель
	private int denominator; // знаменатель
	
	public Fraction() {
		numerator = denominator = 1;
	}
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public void printFraction() {
		System.out.println(this.numerator + "/" + this.denominator);
	}
	
}
