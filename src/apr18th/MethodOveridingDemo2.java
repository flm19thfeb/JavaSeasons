package apr18th;

public class MethodOveridingDemo2 {

	public static void main(String[] args) {
		
		Two obj1=new Two();
		
		//obj1.setX(10);
		obj1.putX(10);
		obj1.setX(20);
		obj1.greet();
		obj1.showAll();

	}

}
