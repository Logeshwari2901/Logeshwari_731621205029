package day2assigment;

class myClass{
	String name;
	String breed;
	myClass(String name,String breed){
		this.name=name;
		this.breed=breed;
		}
	void set() {
		this.name="puppy";
		this.breed="bullDog";
		}
	void displayResult() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+breed);
		}
	}
public class Dog {
	public static void main(String[] args) {
		myClass obj1 = new myClass("jimmy","jerman shepard");
		myClass obj2 = new myClass("scooby","podal");
		obj1.displayResult();
		obj2.set();
		obj2.displayResult();
		}
	}



