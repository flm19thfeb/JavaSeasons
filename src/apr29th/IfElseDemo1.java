package apr29th;

import java.util.Scanner;

public class IfElseDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Enter your Salary : ");
		//int sal=10000;
		
		Scanner input=new Scanner(System.in);
		
		int sal=input.nextInt();
		
		if(sal<20000)
		{
			sal=sal+(sal*10/100);
		}
		else if(sal >=20000 || sal<30000 )
		{
			sal=sal+(sal*20/100);
		}
		else if(sal>=30000)
		{
			sal=sal+(sal*30/100);
		}
		
		System.out.println("Net Salary "+sal);

	}

}
