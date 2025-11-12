package Student_mini_project;

import java.util.*;
import java.util.List;

public class AddStudent {
	public void add(List<Student_Entity> std) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID :");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name :");
		String name = sc.nextLine();
		System.out.println("Enter Student Age  :");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Marks :");
		int marks=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Mobile Number 10 Digit :");
		String number = sc.nextLine();
		if(number.length()==10){
			std.add(new Student_Entity(id, name, age,marks, number));

			System.out.println("New Student Added ..!");
		}
		else {
			System.out.print("Please Enter 10 Digit Number ");
		}
		

		

	}
}
