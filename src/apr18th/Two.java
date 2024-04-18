package apr18th;

public class Two extends One {
	
	int x;
	
	public void putX(int x)
	{
		this.x=x;
	}
	
	public  void greet()
	{
		System.out.println("Hi..Good Evening...");
	}
	
	public void showAll()
	{
		//super.greet();
		super.greet();
		System.out.println(x);  //Two
		System.out.println(super.x);  //One
	}

}
