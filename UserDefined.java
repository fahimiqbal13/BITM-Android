import java.util.ArrayList;
import java.util.Arrays;


public class UserDefined {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> rolList=new 
		
		FindMax();
		//sum();
	}

	private static void FindMax() {
		
		int []num={2,3,4,5};
		int sum=0;
		int max=0;
		for(int i=0;i<num.length;i++)
		{
			//sum=sum+num[i];
			if(max<num[i])
			{
				max=num[i];
			}
			
			
		}
		Arrays.sort(num);
		System.out.println(num[num.length-1]);
		System.out.println(max);
			
	}

	private static void sum() {
		int []num={2,6,4,5};
		int sum=0;
		
		int max=0;
		for(int i:num)
		{
			if(max<i)
			{
				max=i;
			}
		}
		System.out.println(max);
		
		
	}

}
