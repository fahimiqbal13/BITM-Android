import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Class3 {
	public static void main(String[] args){
		
		
		//System.out.println(car.brand);
		
		

	    
		//find_max_in_array();
	    //shuffle_position();
	    //arraylist_replace_index();
		check_user_defined();
	}
	
	public static void check_user_defined(){
		Car car = new Car();
		car.brand = "BMW";
		car.color = "White";
		car.milage = 23;
		car.speed = 155;
		
		Car car2 = new Car();
		car2.brand = "Lamborgini";
		car2.color = "Steel";
		car2.milage = 20;
		car2.speed = 250;
		
		Car car3 = new Car();
		car3.brand = "Bugati";
		car3.color = "Black";
		car3.milage = 14;
		car3.speed = 280;
		
		Car car4 = new Car();
		car4.brand = "Ferrari";
		car4.color = "Red";
		car4.milage = 18;
		car4.speed = 220;
		
		
		ArrayList<Car> garrage = new ArrayList<Car>();
		garrage.add(car);
		garrage.add(car2);
		garrage.add(car3);
		garrage.add(car4);
		
		//System.out.println(garrage.get(0).brand);
		
		//System.out.println(garrage);
		for(Car singleCar : garrage){
			System.out.println("Brand: "+singleCar.brand);
			System.out.println("Color: "+singleCar.color);
			System.out.println("Mileage: "+singleCar.milage);
			System.out.println("Speed: "+singleCar.speed);
			System.out.println("------------------");
	    }
	}
	
	
	
	
	
	
	public static void arraylist_replace_index(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(22);
		list.add(13);
		list.add(42);
		
		list.set( 1, 14 );
		
		for(int num : list){
			System.out.println(num);
	    }
	}
	
	public static void shuffle_position(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(22);
		list.add(13);
		list.add(42);
		
//		long seed = System.nanoTime();
//		Collections.shuffle(list, new Random(seed));
		Collections.shuffle(list);
		
		for(int num : list){
			System.out.println(num);
	    }
	}
	
	public static void arrraylist_duplicate_last_index(){
		int max=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(11);
		list.add(14);
		list.add(22);
		list.add(25);
		list.add(14);
		list.add(29);
		list.add(19);
		//System.out.println(list.size());
		list.add(6);
		list.add(19);
		list.add(14);
		//list.remove(0);
		
		Collections.reverse(list);
		
		System.out.println("Enter a value:");
		Scanner sc = new Scanner(System.in);
		int userValue = sc.nextInt();
		int index = 0;
		boolean found = false;
		
	    for(int num : list){
	    	System.out.println(num);
	    	if(max<num){
				max = num;
			}
	    	
	    	if(!found && userValue==num){
	    		System.out.println("Value "+num+" found. Index is: "+list.lastIndexOf(num));
	    		found = true;
	    	}
	    	index++;
	    }
	    
	    if(!found){
	    	System.out.println("Value not found");
	    }
	    
	    
	    int lastValue = list.get(list.size() - 1);
	    
	    System.out.println(lastValue);
	}
	
	public static void find_max_in_array(){
		int[] numbers = {1,2,3,4,5,6,11,8,9,10};
		int total = 0;
		int max=0;
		
		for(int i=0; i<numbers.length; i++){
			if(i==0){max=numbers[i];}
			if(max<numbers[i]){
				max = numbers[i];
			}
		}
		
		//System.out.println(max);
		
	    Arrays.sort(numbers);

	    int min =numbers[0];
	    System.out.println(min);
	    max= numbers[numbers.length-1];
	    System.out.println(max);
	    
	    for(int num : numbers){
	    	//System.out.println(num);
	    	if(max<num){
				max = num;
			}
	    }
	    System.out.println(max);
	}

}
