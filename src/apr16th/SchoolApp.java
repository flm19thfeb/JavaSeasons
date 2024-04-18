package apr16th;

import apr18th.Leave;

public class SchoolApp {

	public static void main(String[] args) {
		
			//Student s1=new Student();
			//Marks s1=new Marks();
			Leave s1=new Leave();
			//s1.setDetails(1, "John");
			s1.rollNo=2;
			s1.studentName="Sam";
			s1.getDetails();
			s1.setMarks(80, 90, 90);
			s1.getResults();
			s1.setLeaves(4, 5);
			s1.getLeaves();

	}

}
