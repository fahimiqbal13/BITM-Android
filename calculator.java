import java.util.Scanner;


public class calculator{

	public static void main(String[] args) {
		int month;
		char choice;
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Input first number # :");
		int firstNumber = Input.nextInt();
		System.out.println("Input second number # :");
		int secondNumber = Input.nextInt();
		System.out.println("Input choicer # :");
		 choice = Input.next().charAt(0);
		if(choice=='+')
		{
			int res=sum(firstNumber,secondNumber);
			System.out.println(res);
		}
		else if (choice=='*')
		{
			double res=multiply(firstNumber,secondNumber);
			System.out.println(res);	
		}
		else if (choice=='/')
		{
			double res=divide(firstNumber,secondNumber);
			System.out.println(res);	
		}
	}
		static double divide(double i, double j) 
	    {
			double result=i/j;
		return result;
		
	    }
		
    static int sum(int i, int j) 
	    {
		int result=i+j;
		return result;
		
	    }
	    static double multiply(int i, int j) 
	    {
		int result=i+j;
		return result;
		
	    }

		}







