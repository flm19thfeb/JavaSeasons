package apr8th;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1=new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		p1.greet();
		
		p1.name="Sivamani";
		p1.age=35;
		p1.phone=9848022338L;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		p1.greet();
		
		Person p2=new Person();
		
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.phone);

	}

}
