package github;

class Student{
	int rollNo;
	String name;
	
	void setValues(int roll, String n) {
		rollNo = roll;
		name = n;
	}
	
	void displayStudentInfo() {
		System.out.println("Student name : "+name);
		System.out.println("Student roll no : "+rollNo);
	}
}

class Teacher{
	String name;
	String subject;
	
	void setValues(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}
	
	void showValues() {
		System.out.println("Teacher name : "+name);
		System.out.println("Teacher subject : "+subject);
	}
}

class School{
	Student s = new Student();
	Teacher t = new Teacher();
}

public class HAS_A_Relationship {
	public static void main(String[] args) {
		School s1 = new School();
		School s2 = new School();
		School s3 = new School();
		
		// Calling student properties
		s1.s.setValues(101, "Aniket");
		s2.s.setValues(102, "Ram");
		s3.s.setValues(103, "Shyam");
		
		s1.s.displayStudentInfo();
		s2.s.displayStudentInfo();
		s3.s.displayStudentInfo();
		
		// Calling teacher properties
		s1.t.setValues("Binita", "SIC");
		s2.t.setValues("Nessi", "CL");
		
		s1.t.showValues();
		s2.t.showValues();
	}
}
