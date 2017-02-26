/*
 * ������� 2.
 * ���������� ����� ������� � ���� ���� m/n. 
 * �������� ������ �� k ������, ������/������� �������� ��� ������� ������.
 * 
Date: 20/02/2017
Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls4.task2;

public class Fraction {
	private int numerator; // ���������
	private int denominator; // �����������
	
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
