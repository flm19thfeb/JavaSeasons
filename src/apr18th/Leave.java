package apr18th;

import apr16th.Marks;

public class Leave extends Marks{
	
	int cl,sl;
	
	public void setLeaves(int cl,int sl)
	{
		this.cl=cl;
		this.sl=sl;
	}
	
	public void getLeaves()
	{
		System.out.println("Total Leaves taken "+(sl+cl));
	}
	
	public void getDetails()
	{
		System.out.println("Roll No : "+rollNo);
		 System.out.println("Student Name : "+studentName);
		
	}

}
