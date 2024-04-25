import java.util.Scanner;
class LiftQueriesDemo
{
	 public static void Demo(int n, Scanner sc)
	 {
        	int a = 1, b = 7;
        	while (n != 0)
	 	{
          	  System.out.println("Enter the test case:");
          	  int call = sc.nextInt();
            	if (Math.abs(call - a) <= Math.abs(call - b)) 
		{
               		 System.out.println("A");
              		  a = call;
            	} else 
		{
                System.out.println("B");
                b = call;
            	}
           	 n--;
        	}
	}

	public static void main(String[] args)
	 {
        	Scanner sc = new Scanner(System.in);
       		System.out.println("Enter the number of test cases:");
      		int n = sc.nextInt();
       		Demo(n, sc);
    }
}