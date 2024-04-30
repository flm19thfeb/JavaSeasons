package apr30th;

public class LogicalOperatorsDemo1 {

	public static void main(String[] args) {
		
		int x=10,y=20;
		
		System.out.println(x>15 && y>15); //false
		System.out.println(x>15 || y>15 );//true
		
		System.out.println(!(x>15 && y>15)); //true
		System.out.println(!(x>15 || y>15) );//false

	}

}
