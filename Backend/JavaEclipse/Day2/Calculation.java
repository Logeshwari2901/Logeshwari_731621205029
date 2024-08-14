package Day2;
import java.util.*;
class Student {
    int regNo;
    String stuName;
    int arr [] = new int[5];
    int sum = 0;
    double average;
    String grade;

    Student(int regNo, String stuName) {
        this.regNo = regNo;
        this.stuName = stuName;
    }
    void getMarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
        }
    }
    void calculateGrade() {
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        average = (double) sum / 5;
        if (average > 90 && average <= 100) {
            grade = "O";
        } else if (average > 80 && average<= 90) {
            grade = "A+";
        } else if (average > 70 && average <= 80) {	
            grade = "A";
        } else if (average > 60 && average <= 70) {
            grade = "B+";
        } else if (average >= 50 && average <= 60) {
            grade = "B";
        } else if (average < 50) {
            grade = "Fail";
        }
    }

    void display() {
        System.out.println("Registration Number: " + regNo);
        System.out.println("Student Name: " + stuName);
        System.out.println("Total Marks: " + sum);
        System.out.println("Average: " + average);
        System.out.println("The Grade is: " + grade);
    }
}
public class Calculation {
    public static void main(String[] args) {
        Student student = new Student(5029, "Logeshwari");
        student.getMarks();
        student.calculateGrade();
        student.display();
    }
}