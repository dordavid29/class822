package class_15_10;

public class Student {
	private int grade,age;
	public static int sumGrade=0;
	public static int sumAge=0;
	public static int countGrade=0;
	public static int countAge=0;
	private String name;
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name) {
		super();
		this.grade = (int)(Math.random()*100);
		this.age = (int)(Math.random()*100)+20;
		sumGrade+= grade;
		sumAge+= age;
		countGrade++;
		countAge++;
		this.name = name;
	}
	public static double averageGrade() {
		return (double)sumGrade/countGrade;
	}
	public static double averageAge() {
		return (double)sumAge/countAge;
	}
	public String toString() {
		return "Name: " + name + ", age: " + age + ", grade: " + grade;
	}
}
