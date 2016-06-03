import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ArrayListProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(12);
		list.add(10);
		list.add(15);
		list.add(12);
		list.add(15);
		//Collections.reverse(list);
		//Collections.shuffle(list);
		Scanner Input = new Scanner(System.in);
		//int num=Input.nextInt();
		list.set(1, 12);
		
		for(int i:list)
		{
			
		System.out.println((i));	
			
		}

	}

}
