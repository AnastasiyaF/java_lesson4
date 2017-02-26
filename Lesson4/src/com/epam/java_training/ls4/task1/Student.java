/*
 * Задание 1.
 * 
 * Создать описанные ниже классы. Определить конструктор и методы set(), get(), show(). 
Определить дополнительно какой – либо метод для каждого класса. 
Реализовать класс в консольном приложении. 
Задать критерий выбора данных и вывести эти данные на консоль.
Student : id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс.


Date: 20/02/2017
Author: Anastasiya Findziukevich
 * 
 */

package com.epam.java_training.ls4.task1;

public class Student {
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	
	private String dateofbirth;
	private String address;
	private String telephone;
	private String faculty;
	private int course;

	public Student(){
		id = 0;
		surname = "";
		name = "";
		patronymic = "";
		
		dateofbirth = "01/01/1900";
		address = "";
		telephone = "";
		faculty = "";
		course = 0;
		
	}
	
	public Student(int id, String surname, String name, String patronymic,
			        String dateofbirth, String address, String telephone, String faculty,
			        int course){
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		
		this.dateofbirth = dateofbirth;
		this.address = address;
		this.telephone = telephone;
		this.faculty = faculty;
		this.course = course;
		
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
	
	public void setDateofbirth(String dateofbirth){
		this.dateofbirth = dateofbirth;
	}
	
	public String getDateofbirth(){
		return this.dateofbirth;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public void setTelephone(String telephone){
		this.address = telephone;
	}
	
	public String getTelephone(){
		return this.telephone;
	}
	
	public void setFaculty(String faculty){
		this.faculty = faculty;
	}
	
	public String getFaculty(){
		return this.faculty;
	}
	
	public void setCourse(int course){
		this.course = course;
	}
	
	public int getCourse(){
		return this.course;
	}
	
	public String show(){
		
		return "id = " + id + ", surname = " + surname + ", name = " + name +
			   ", patronymic = " + patronymic + ", dateofbirth = " + dateofbirth +
		       ", address = " + address + ", telephone = " + telephone + ", course = " + course;
	}
	
	public String showStudentFIO(){
		
		return "id = " + id + ", surname = " + surname + ", name = " + name +
			   ", patronymic = " + patronymic;
		
	}
	
	public String showStudentGeneralValue(){
		
		return "id = " + id + ", surname = " + surname + ", name = " + name +
				   ", telephone = " + telephone;
		
	}
	
	public void showDetails(int caseChoise){
		
		String result = "No such values.";
		
		if (caseChoise == 1){
			result = show();
		}
		else if (caseChoise ==  2){
			result = showStudentFIO();
		}
		else if (caseChoise ==  3){
			result = showStudentGeneralValue();
		}
		
		System.out.println(result);
	}
	
}
