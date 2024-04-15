package apr15th;

public class SumTest {

	public static void main(String[] args) {
		
		Sum obj1=new Sum();
		
		obj1.add(10, 20);
		
		obj1.add(10.22, 20.33);
		
		obj1.add(2200011000L, 3300022000L);
		
		obj1.add(2.33f, 3.22f);
		
		obj1.add(10, 20,30);
		
		obj1.add(1, "FLM");
		
		obj1.add("Abc", 2);

	}

}
