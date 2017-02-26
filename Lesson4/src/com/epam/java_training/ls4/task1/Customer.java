/*
 * Задание 1.
 * Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, 
 * Номер банковского счета.

Date: 20/02/2017
Author: Anastasiya Findziukevich
 * 
 */

package com.epam.java_training.ls4.task1;

public class Customer {
	private int id;
	private String surname;
	private String name;
	private String patronymic;

	private String address;
	private String numberCreditCard;

	public Customer(){
		id = 0;
		surname = "";
		name = "";
		patronymic = "";
	
		address = "";
		numberCreditCard = "0000 0000 0000 0000";
		
	}
	
	public Customer(int id, String surname, String name, String patronymic,
			        String address, String numberCreditCard){
		setId(id);
		setSurname(surname);
		setName(name);
		setPatronymic(patronymic);
		setAddress(address);
		setNumberCreditCard(numberCreditCard);
		
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return this.id;
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
	
	public void setPatronymic(String patronymic){
		this.patronymic = patronymic;
	}
	
	public String getPatronymic(){
		return this.patronymic;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getNumberCreditCard(){
		return this.numberCreditCard;
	}
	
	public void setNumberCreditCard(String numberCreditCard){
		this.numberCreditCard = numberCreditCard;
	}
	
	public String show(){
		
		return "id = " + id + ", surname = " + surname + ", name = " + name +
			   ", patronymic = " + patronymic + ", address = " + address + 
			   ", numberCreditCard = " + numberCreditCard;
	}
	
	public String showCustomerFIO(){
		
		return "id = " + id + ", surname = " + surname + ", name = " + name +
			   ", patronymic = " + patronymic;
		
	}
	
	public String showCustomerGeneralValue(){
		
		return "id = " + id + ", surname = " + surname + ", name = " + name +
				   ", numberCreditCard = " + numberCreditCard;
		
	}
	
	public void showDetails(int caseChoise){
		String result = "No such values.";
		
		if (caseChoise == 1){
			result = show();
		}
		else if (caseChoise ==  2){
			result = showCustomerFIO();
		}
		else if (caseChoise ==  3){
			result = showCustomerGeneralValue();
		}	
		
		System.out.println(result);
	}
}
