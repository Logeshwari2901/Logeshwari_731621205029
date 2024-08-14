package day2assigment;
class Shape {

	float pi=3.14f;

	int radius;

	float area;

	float circumference;

Shape(int radius){

	this.radius=radius;

}

void AreaCircum() {

	area=pi*radius*radius;

	circumference=2*pi*radius*radius;

}

void display() {

	System.out.println("Area of Circle : "+area);

	System.out.println("Circumference of Circle : "+circumference);

}

public void Circumference(float circumference){

	this.circumference=circumference;

}

}



public class Circle {

	public static void main(String[]args) {

		Shape cir=new Shape(19);

		cir.AreaCircum();

		cir.Circumference(87);

    	cir.display();



	}



}



