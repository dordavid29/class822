package class_15_10;

public class ProgramStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Maor");
		Student s2 = new Student("Lichay");
		Student s3 = new Student("Talya");
		Student s4 = new Student("Nil");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println("Average age of all student: " + Student.averageAge());
		System.out.println("Average grade of all student: " + Student.averageGrade());
	}

}
