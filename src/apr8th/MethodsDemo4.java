package apr8th;

public class MethodsDemo4 {

	public static void main(String[] args) {
		
		MethodsDemo4.sumOfNaturalNumbers(5);
		MethodsDemo4.sumOfNaturalNumbers(10);
		MethodsDemo4.sumOfNaturalNumbers(100);

	}
	
	public static void sumOfNaturalNumbers(int n)
	{
		int res=(n*(n+1)/2);
		
		System.out.println("Sum of "+n+" natural numbers is "+res);
		
	}

}
