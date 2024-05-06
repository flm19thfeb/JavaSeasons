package may6th;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		
		List al= new ArrayList();
		
		System.out.println(al.size()); //0
		
		al.add(10);
		
		al.add(20);
		
		al.add(30);
		
		al.add(40.55);
		
		al.add("FLM");
		
		System.out.println(al.size()); // 5
		
		System.out.println(al);
		
		al.add(10);
		
		al.add(20);
		
		al.add(30);
		
		al.add(40.55);
		
		al.add("FLM");
		
		System.out.println(al.size()); // 10
		
		System.out.println(al);
		
		al.add("Selenium");
		System.out.println(al.size()); //11
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		for(Object temp:al)
		{
			System.out.println(temp);
		}
		
		System.out.println(al.contains(40.55));

	}

}
