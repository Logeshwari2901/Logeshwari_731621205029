package day2assigment;
class Class{
	String name;
	int age;
	Class(String name,int age){
		this.name=name;
	this.age=age;
	}
	void displayResult() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		}
	}
public class Person {	
	public static void main(String[] args) {
		Class obj1 = new Class("Logeshwari",21);
		Class obj2 = new Class("Hussain",20);
		obj1.displayResult();
		obj2.displayResult();
		}
	}
