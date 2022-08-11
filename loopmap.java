/********************************************
*Write a program that does the following:
*Asks the user for 5 numbers
*Stores them in an array list
*Finds the sum, product, largest, and smallest of those numbers
********************************************/


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 5 numbers");
		
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		while (numbers.size() < 5) {
			numbers.add(Integer.parseInt(input.nextLine()));
		}
		System.out.println("Here are your numbers: " + numbers);
		
		Integer sum = 0;
		for(int i = 0; i < numbers.size(); ++i) {
			sum += numbers.get(i);
		}
		System.out.println("Here is the sum of your numbers: " + sum);
		
		Integer product = 1;
		for(int i = 0; i < numbers.size(); ++i) {
			product *= numbers.get(i);
		}
		System.out.println("Here is the product of your numbers: " + product);
		
		int largestNum = Collections.max(numbers);
		System.out.println("Here is the largest of your numbers: " + largestNum);
		
		int smallestNum = Collections.min(numbers);
		System.out.println("Here is the smallest of your numbers: " + smallestNum);
		
		
		input.close();
	

	}

}

/**********************You are a car dealer. Create a hash map of vehicles.
*The model is the Key, the make is the Value.
*Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
*(e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")***********/


import java.util.HashMap;
import java.util.Scanner;

public class Map {

	public static void main(String[] args) {
		HashMap<String, String> cars = new HashMap<>();
		
		cars.put("Civic", "Toyota");
		cars.put("Hyundai", "Ford");
		cars.put("BMW", "Nissan");
		
		Scanner input = new Scanner(System.in);
		System.out.println("What kind of car are you looking for?");
		String car = input.nextLine();
		
//		
//		for(String key: cars.keySet()) {
//			System.out.println(key);
//		}
//		
		System.out.println(cars.keySet());
		
	
		for(HashMap.Entry<String, String> c: cars.entrySet()){
			System.out.println(c);
		}
		System.out.println(cars.get(car));
		if(cars.containsKey(car)) {
			System.out.print("Here are the Hyundai we have: " + cars.get(car));
			
		}

	}

	private static String getValue(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
Footer

