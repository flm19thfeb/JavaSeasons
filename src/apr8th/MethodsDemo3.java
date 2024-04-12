package apr8th;

public class MethodsDemo3 {

	public static void main(String[] args) {
		
		MethodsDemo3 obj=new MethodsDemo3();
		
		System.out.println(obj.sumOfNaturalNumbers(5));
		
		System.out.println(obj.sumOfNaturalNumbers(10));
		
		System.out.println(obj.sumOfNaturalNumbers(100));

	}
	
	public int sumOfNaturalNumbers(int n)
	{
		int res=(n*(n+1)/2);
		
		System.out.print("Sum of "+n+" natural numbers is ");
		
		return res;
		
	}

}
