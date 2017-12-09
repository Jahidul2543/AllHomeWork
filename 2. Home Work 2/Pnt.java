package homework2;

public class Pnt {
	
	String sSubject1 = "Selenium";
	String sInstructor1 = "M. R. Mafi";
	
	String sSubject2 = "UFT";
	String sInstructor2 = "Amin";
	
	
	public int totalStudent(int totalSelStudent, int totalUftStudent) {
		
		int totalStudent = totalSelStudent + totalUftStudent ;
		
		System.out.println("Total Student: " + totalStudent);
		
		return totalStudent;
		
		
		
	}
	

}
