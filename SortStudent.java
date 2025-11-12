package Student_mini_project;

import java.util.*;
import java.util.Comparator;

public class SortStudent {
	public void sorting(List<Student_Entity> std) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Sort By ID \n2.Sort By Name \n3.Sort By Marks");
		int choice = sc.nextInt();
		sc.nextLine();
		if (choice == 1) {
			std.sort(Comparator.comparingInt(Student_Entity::getId));//'::' double colon Is A Method Reference Operator 
		} else if (choice == 2) {
			std.sort(Comparator.comparing(Student_Entity::getName));
		} else if (choice == 3) {
			std.sort(Comparator.comparing(Student_Entity::getMarks));
		} else {
			System.out.println("Invalid Choice !");
		}
	}
}
