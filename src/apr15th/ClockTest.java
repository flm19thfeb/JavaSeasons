package apr15th;

public class ClockTest {

	public static void main(String[] args) {
		
		//user1
		Clock c1=new Clock();
		//c1.Clock();
		c1.setClock(9);
		c1.getClock();
		
		
		//user2
		Clock c2=new Clock();
		c2.setClock(9,10);
		c2.getClock();

	}

}
