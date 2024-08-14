package day4;

class Animal{
	void move() {
		System.out.println("All animals move from one to another place");
	}
	void eat() {
		System.out.println("All animals will eat something");
	}
}
class Dog extends Animal {
	void move() {
		System.out.println("Dog will walk");
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}
class Fish extends Animal {
	void move() {
		System.out.println("Fish will swim");
	}
	void eat() {
		System.out.println("Fish will small fish");
	}
}
class Bird extends Animal {
	void move() {
		System.out.println("Bird will fly");
	}
	void eat() {
		System.out.println("Bird eat nuts");
	}
}

public class myclass {
	public static void main (String [] args) {
		Dog dog = new Dog();
		Fish fish =new Fish();
		Bird bird =new Bird();
		dog.move();
		dog.eat();
		fish.move();
		fish.eat();
		bird.move();
		bird.eat();
		
		//Dynamic method dispatch    
		
				//Animal animal;
				//animal = new Dog();
				//animal.move();
				//animal.eat();
				//animal = new Bird();
				//animal.move();
				//animal.eat();
				//animal = new Fish();
				//animal.move();
				//animal.eat();
				}
		}
	


