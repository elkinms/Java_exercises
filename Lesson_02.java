/*
 * 1. public static int factorial(int number)
 * number 5 5*4*3*2*1 = 120
 * return 120
 * 
 * 2. public static void taxi(int code)
 * code -> 1 => "Iossi, GO"
 * 		   2 => "Hanna, GO"
 * 		   3 => "Alex, GO"
 * 		   4 => "Tanya, GO"
 * 		   ERROR
 * use switch!
 * 
 * 3. public static int digitsSum(int number)
 * number = 628 => 8+2+6 = 16
 * return 16
 */

public class Lesson_02 {

	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println("Result " + result);
		
		taxi(2);
		
		int result1 = digitSum(628);
		System.out.println("Result = " + result1);

	}
	
//1
	static int factorial(int number) {
		int res = 1;
		while (number > 0) {
			res *=number;
			number--;
		}
		return res;
	}
	
//2
	static void taxi(int code) {
		switch (code) {
			case 1: System.out.println("Iossi, GO!");
			case 2: System.out.println("Hanna, GO!");
			case 3: System.out.println("Alex, GO!");
			case 4: System.out.println("Tanya, GO!");
		} 
	}

//3
	static int digitSum(int number) {
		int sum = 0;
		while(number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}	
}
