

	import java.util.Scanner;
	public class HelloUser 

	{
		String userName;
	 
		public HelloUser()
		{
			this.userName="InitialValue";
		}
		
	 
		public void greetUser()
		{
		 System.out.println("Hello ASE2015 - how are you? :)");
		 System.out.println("Please enter your name :)");
		 Scanner scanner1 = new Scanner( System.in );
		 userName = scanner1.nextLine();
		 System.out.print("Hello " + userName);
		}
	 
	}



