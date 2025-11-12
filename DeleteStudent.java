package Student_mini_project;

import java.util.*;
import java.util.List;

public class DeleteStudent {
	public void delete(List<Student_Entity> std) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID To Delete :");
		int id = sc.nextInt();
		sc.nextLine();
		boolean remove = std.removeIf(s -> s.getId() == id);
		if (remove) {
			System.out.println("Remove Succesfully ");
		} else {
			System.out.println("Id Not FOund");
		}
	}
}
