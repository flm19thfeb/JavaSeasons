package apr16th;

public class Student {
	
	protected int rollNo;
	protected String studentName;
	
	public void setDetails(int rollNo,String studentName)
	{
		this.rollNo=rollNo;
		this.studentName=studentName;
	}
	
	public void getDetails()
	{
		System.out.println("Roll No : "+rollNo+"  student Name : "+studentName);
		
	}
	

}
