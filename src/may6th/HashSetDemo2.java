package may6th;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		
		System.out.println(hs.add("FLM"));
		
		hs.add("Selenium");
		
		hs.add("TOSCA");
		
		hs.add("Java");
		
		hs.add("Appium");
		
		System.out.println(hs.size());//5
		System.out.println(hs);
		
		///using Iterator
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
