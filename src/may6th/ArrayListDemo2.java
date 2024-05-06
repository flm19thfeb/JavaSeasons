package may6th;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		//al.add(30.33);
		al.add(30);
		
		System.out.println(al);
		
		for(int  temp:al)
		{
			System.out.println(temp);
		}

	}

}
