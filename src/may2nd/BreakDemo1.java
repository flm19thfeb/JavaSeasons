package may2nd;

public class BreakDemo1 {

	public static void main(String[] args) {
		
		int count=1;

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
						if(i==3)
							continue;
					System.out.println("Iteration "+count+" : "+i+"   "+j);
					count++;
					
			}
			
			
		}

	}

}
