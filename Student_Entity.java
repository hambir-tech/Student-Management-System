package Student_mini_project;

public class Student_Entity {
	private int id;
	private String name;
	private int age;
	private int marks;
	private String mobileNumber;

	public Student_Entity(int id, String name, int age,int marks, String number) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks=marks;
		this.mobileNumber = number;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Student_Entity [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", mobileNumber="
				+ mobileNumber + "]";
	}

}
