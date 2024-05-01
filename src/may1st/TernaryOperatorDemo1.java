package may1st;

import java.util.Scanner;

public class TernaryOperatorDemo1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		//if(x>=0)
		//{
		//	System.out.println("+ve");
		//}
		//else
		//{
		//	System.out.println("-ve");
		//}
		
		System.out.println(x>=0?"+ve":"-ve");

	}

}
