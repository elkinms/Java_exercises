/*
 * 1. 	public static int oddsCount(int number)
 * 		number = 34567 => return 3
 * 
 * 2.	public static int evensSum(int number)
 * 		number = 34567 => 6+4 = 10 return 10
 * 
 * 3.	public static int digitCount(int number, int digit)
 * 		number - 34565 digit = 5 return 2
 * 
 * 4.	public static int reverseNumber(int number)
 * 		number = 3456 => return 6543 
 * 		last digit not ZERO 
 */

public class Lesson_03 {

	public static void main(String[] args) {
		
		int res = Lesson_03.oddsCount(34567);
		System.out.println("Result = " + res);
		
		int res1 = Lesson_03.evensSum(34567);
		System.out.println("Sum = " + res1);
		
		int res2 = Lesson_03.digitCount(34565, 5);
		System.out.println("Numer of digits = " + res2);
		
		int res3 = Lesson_03.reverseNumber(3456);
		System.out.println("Reverse Number = " + res3);

	}

//1
	public static int oddsCount(int number) {
		int count = 0;
		while(number != 0) {
			if(number % 2 != 0) {
				count++;
			}
			number /= 10;
		}
		return count;
	}
	
//2
	public static int evensSum(int number) {
		int sum = 0;
		int div = 0;
		while(number != 0) {
			div = number % 10;
			if(div % 2 == 0) {
				sum += div;
			}
			number /= 10;
		}
		return sum;
	}

//3
	public static int digitCount(int number, int digit) {
		int count = 0;
		int div = 0;
		while(number != 0) {
			div = number % 10;
			if(div == digit) {
				count++;
			}
			number /= 10;
		}
		return count;
	}
	
//4
	public static int reverseNumber(int number) {
		int revNumber = 0;
		int div = 0;
		while(number != 0) {
			div = number % 10;
			revNumber = revNumber * 10 + div;
			number /= 10;
		}
		return revNumber;
	}
}
