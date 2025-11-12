package Student_mini_project;

import java.util.*;

public class SearchStudent {
	public void search(List<Student_Entity> std) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Search By ID \n2.Search By Name ");
		int idd=sc.nextInt();
		sc.nextLine();
		switch(idd) {
		case 1:
			System.out.println("Enter Student ID :");
			int sid=sc.nextInt();
			sc.nextLine();
			if(!std.isEmpty()) {
			for(Student_Entity s1:std) {
				if(s1.getId()==sid) {
					System.out.println("Id Founded "+s1);
					return;
				}
			}
			
			}else {
				System.out.println("Id Not Found");
			}
			
			break;
		case 2:
			System.out.println("Enter Student Name :");
			String name=sc.nextLine();
			if(!std.isEmpty()) {
				for(Student_Entity s2:std) {
					if(s2.getName().equals(name)) {
						System.out.println("ID Founded "+s2);
						return;
					}
				}
			}else {
				System.out.println("Id Not Found");
			}
			
		}
		
	}
}
