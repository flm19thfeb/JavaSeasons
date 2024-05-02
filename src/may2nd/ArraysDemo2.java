package may2nd;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		
		int[] a=new int[10];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		a[0]=100;
		
		a[5]=600;
		
		a[9]=1000;
		

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
