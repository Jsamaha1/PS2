package MainPackage;

public class MyInteger {
	// Creates the int data field that stores the value of this object
	// To keep the class encapsulated the variable is private.
	private int value;
	
	//Creates a constructor of the class for use by the other methods
	public MyInteger(int value){
		this.value = value;
	}
	
	//A get method that returns the value of value
	public int getValue(){
		// references the value associated with this class
		return this.value;
	}
	
	// Method determines if a value is even
	public boolean isEven(){
		// Checks if the value is even using the modulo operator
		if(value%2 == 0)
			return true;
		else
			return false;
	}
	
	// Method that determines if a value is odd
	public boolean isOdd(){
		// Checks if the value is odd using the modulo operator
		if(value%2 == 1)
			return true;
		else
			return false;
	}
	
	// Method that determines if a value is prime
	public boolean isPrime(){
		// Initiates a flag for if the value is prime
		boolean isPrime = true;
		// Anything under 2 is not a prime number, so set the flag to false
		if(value < 2)
			isPrime = false;
		// Loops through values to see if there is a number indicating the values not prime
		for(int i = 2; i < value; i++) {
			if(value % i == 0)
				isPrime = false;
		}
		// Returns true or false depending on whether the value is prime
		return isPrime;
	}
	
	// Determines if a given value is prime
	public static boolean isEven(int value){
		// Uses the modulo operator to check if the value is even
		if(value%2 == 0)
			return true;
		else
			return false;
	}
	
	// Determines if a given value is odd
	public static boolean isOdd(int value){
		// Use the modulo operator to determine if the value is odd
		if(value%2 == 1)
			return true;
		else 
			return false;
	}
	
	// Determines if a value is prime
	public static boolean isPrime(int value){
		// Initiate a flag for if the value is prime
		boolean isPrime = true;
		
		// if the value is less than 2 it is not prime
		if(value%2 == 0)
			isPrime = false;
		// Loop through values to see if the number is prime.
		for(int i = 2; i < value; i++){
			if(value%i == 0)
				isPrime = false;
		}
		return isPrime;
	}
	
	// Decides if the MyInteger type is even
	public static boolean isEven(MyInteger number){
		if(number.value%2 == 0)
			return true;
		else
			return false;
	}
	
	// Decides if an instance if the MyInteger class is odd
	public static boolean isOdd(MyInteger number){
		if(number.value % 2 == 1)
			return true;
		else
			return false;
	}
	
	// Decides if an instance of the MyInteger is prime
	public static boolean isPrime(MyInteger number){
		// Creates a flag about if the value is prime, initialized to true
		boolean isPrime = true;
		if(number.value < 2)
			isPrime = false;
		for(int i = 2; i < number.value; i++) {
			if(number.value % i == 0)
				isPrime = false;
		}
		return isPrime;
	}
	
	// Method about if the value of the object is equal to the specified value
	public boolean equals(int number){
		// Checks if the number is equal to the objects variable
		if(number == value)
			return true;
		else
			return false;
	}
	
	// Method that determines if the value of an object is equal to the specified value
	public boolean equals(MyInteger number){
		// Checks if the value of the instance equals the objects variable
		if(number.value == value)
			return true;
		else
			return false;
	}
	
	// static method to convert an array of numeric values to an int
	public int parseInt(char[] values){
		// Initiate the sum of the values
		int sum = 0;
		for(int i = 0; i < values.length; i++)
		{
			if(Character.isDigit(values[i]))
				sum += values[i];
		}
		return sum;
	}
	
	// static method that converts a string to an int
	public int parseInt(String numbers){
		int convertedNumbers = Integer.parseInt(numbers);
		return convertedNumbers;
	}
}