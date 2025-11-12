package Student_mini_project;
import java.util.*;
public class ReportStudent {
public void reportall(List<Student_Entity>std) {
	System.out.println("---------------Student Report View------------ ");
	if(std.isEmpty()) {
		System.out.println("NO Student Available TO Show ");
	}else {
		for(Student_Entity s:std) {
			System.out.println(s);
		}
	}
}
}
