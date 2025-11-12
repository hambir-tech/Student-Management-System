package Student_mini_project;

import java.util.*;

public class ModifyStudent {
	public void modify(List<Student_Entity> std) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student ID :");
		int sid = sc.nextInt();
		if (!std.isEmpty()) {
			for (Student_Entity s : std) {
				if (s.getId() == sid) {
					System.out.println("1.Update Name \n2.Updated Mobile Number\n3.update Marks  ");
					int c = sc.nextInt();
					sc.nextLine();
					switch (c) {
					case 1:

						if (!std.isEmpty()) {
							System.out.println("Enter New Name :");
							s.setName(sc.nextLine());
							System.out.println("New Name Updated Succesfully ");
							for (Student_Entity s1 : std) {
								System.out.println(s1);
							}
							return;
						}

						break;
					case 2:
						if (!std.isEmpty()) {
							System.out.println("Enter New Number :");
							s.setMobileNumber(sc.nextLine());
							System.out.println("New Number Updated Succesfully ");
							for (Student_Entity s1 : std) {
								System.out.println(s1);
							}
							return;
						}
					case 3:
						if (!std.isEmpty()) {
							System.out.println("Enter New Marks  :");
							s.setMarks(sc.nextInt());
							System.out.println("New Marks Updated Succesfully ");
							for (Student_Entity s1 : std) {
								System.out.println(s1);
							}
						}
						break;
					default:
						System.out.println("Invalid Choice");
					}
				}
			}

		} else {
			System.out.println("Please Add Details First ");
		}

	}
}
