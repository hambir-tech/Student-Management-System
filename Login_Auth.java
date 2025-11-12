package Student_mini_project;
import java.util.*;

public class Login_Auth {
	public Login_Auth() {
		user.put("kali","Kalilinux");
	}
	
	 Map<String ,String > user=new HashMap<>();
	 
	 public void login() {
		    Scanner sc = new Scanner(System.in);
		    int attempts = 0;

		    while (attempts < 3) {
		        System.out.println("Enter User Name :");
		        String username = sc.nextLine();
		        System.out.println("Enter Password  :");
		        String password = sc.nextLine();

		        if (user.containsKey(username)) {
		            String storedPassword = user.get(username);
		            if (storedPassword != null && storedPassword.equals(password)) {
		                System.out.println("Login Successfully");
		                System.out.println("Welcome " + username);

		                List<Student_Entity> std = new ArrayList<>();

		                AddStudent add = new AddStudent();
		                DeleteStudent delete = new DeleteStudent();
		                ModifyStudent modify = new ModifyStudent();
		                SearchStudent search = new SearchStudent();
		                SortStudent sort = new SortStudent();
		                ReportStudent report = new ReportStudent();
		                ShowMenu menu = new ShowMenu();

		                while (true) {
		                    menu.menu();
		                    int choice = sc.nextInt();
		                    switch (choice) {
		                        case 1:
		                            add.add(std);
		                            break;
		                        case 2:
		                            delete.delete(std);
		                            break;
		                        case 3:
		                            modify.modify(std);
		                            break;
		                        case 4:
		                            search.search(std);
		                            break;
		                        case 5:
		                            sort.sorting(std);
		                            break;
		                        case 6:
		                            report.reportall(std);
		                            break;
		                        case 7:
		                            System.out.println("Thank you for using!");
		                            return;
		                        default:
		                            System.out.println("Invalid Choice!");
		                    }
		                }
		            } else {
		                System.out.println("Invalid Username or Password");
		            }
		        } else {
		            System.out.println("Invalid Username or Password");
		        }

		        attempts++;
		    }

		    System.out.println("You are Blocked!!!");
		}

}
