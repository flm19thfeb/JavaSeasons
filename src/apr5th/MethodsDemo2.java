package apr5th;

public class MethodsDemo2 {
	

	public static void main(String[] args) {
		
		MethodsDemo2 obj1=new MethodsDemo2();
		
		obj1.sumOfNaturalNumbers(5);
		
		obj1.sumOfNaturalNumbers(10);
		
		obj1.sumOfNaturalNumbers(100);
		
		obj1.sumOfNaturalNumbers(1000);

	}
	
	public void sumOfNaturalNumbers(int n)
	{
			
		int res=n*(n+1)/2;
		
		System.out.println("Sum of "+n+" natural numbers is "+res);
	}

}
