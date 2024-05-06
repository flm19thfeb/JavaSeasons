package may6th;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		
		System.out.println(hs.add("FLM"));
		
		hs.add("Selenium");
		
		hs.add("TOSCA");
		
		hs.add("Java");
		
		hs.add("Appium");
		
		System.out.println(hs.size());//5
		System.out.println(hs);
		
		System.out.println(hs.add("FLM"));
		
		hs.add("Selenium");
		
		hs.add("TOSCA");
		
		hs.add("Java");
		
		hs.add("Appium");
		
		System.out.println(hs.size()); //5
		System.out.println(hs);
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		

	}

}
