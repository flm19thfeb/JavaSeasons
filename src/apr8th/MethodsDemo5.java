package apr8th;

public class MethodsDemo5 {

	public static void main(String[] args) {
		
	    System.out.println(MethodsDemo5.sumOfNaturalNumbers(5));
		System.out.println(MethodsDemo5.sumOfNaturalNumbers(10));
		System.out.println(MethodsDemo5.sumOfNaturalNumbers(100));

	}
	
	public static int sumOfNaturalNumbers(int n)
	{
		int res=(n*(n+1)/2);
		
		System.out.print("Sum of "+n+" natural numbers is ");
		
		return res;
		
	}

}
