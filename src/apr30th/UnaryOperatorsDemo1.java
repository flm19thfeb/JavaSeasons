package apr30th;

public class UnaryOperatorsDemo1 {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		
		System.out.println(++x*--y);
		//++x;
		
		System.out.println(++x);
		//System.out.println(x++);
		System.out.println(x);
		
		System.out.println(y); //20
		//System.out.println(y--);//20
		System.out.println(--y);//19
		System.out.println(y);//19

	}

}
