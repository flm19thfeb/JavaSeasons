package may3rd;

import apr8th.Person;

public class ArraysDemo3 {

	public static void main(String[] args) {
		
		Person[] data=new Person[10];
		
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		
		Person p1=new Person();
		
		p1.name="John";
		p1.age=30;
		p1.phone=9848022338L;
		
		data[0]=p1;
		
		Person p2=new Person();
		
		p2.name="Ravi";
		p2.age=30;
		p2.phone=9848098480L;
		
		data[9]=p2;
		
		for(int i=0;i<data.length;i++)
		{
			if(data[i]!=null)
			{
			System.out.println(data[i].name);
			System.out.println(data[i].age);
			System.out.println(data[i].phone);
			}
		}
		

	}

}
