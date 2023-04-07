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

class School{
	Student s = new Student();
}

public class HAS_A_Relationship {
	public static void main(String[] args) {
		School s1 = new School();
		School s2 = new School();
		School s3 = new School();
		
		s1.s.setValues(101, "Aniket");
		s2.s.setValues(102, "Ram");
		s3.s.setValues(103, "Shyam");
		
		s1.s.displayStudentInfo();
		s2.s.displayStudentInfo();
		s3.s.displayStudentInfo();
	}
}
