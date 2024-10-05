/*
 *	1. public static void fan(int mode)
 *	mode 0 => "Switched off"
 *		 1 => "Speed 1"
 *		 2 => "Speed 2"
 * 		 3 => "Turbo"
 * 	in other cases Error
 * 
 *  2. public static int trafficDelay(double hour)
 *  [5.00] -- [7.00] => 15 min
 *  7.00 -- [9.00] => 25 min
 *  9.00 -- [11.5] => 18 min
 *  11.5 -- 13.5 => 13 min
 *  in other cases Error
 *  
 *  3. public static void myAge(int age) 
 *  [0] -- 18 => "child"
 *  [18] -- 67 => "adult"
 *  >= 67 => "senior"
 *  
 * 	4. public static int trafficDelay(int hour,
 * 									  int min)
 *  [5.00] -- [7.00] => 15 min
 *  7.00 -- [9.00] => 25 min
 *  9.00 -- [11.5] => 18 min
 *  11.5 -- 13.5 => 13 min
 *  in other cases Error
*/

public class Lesson_01 {
	public static void main(String[] args) {
//1
		Lesson_01.fan(2);
//2
		int res = Lesson_01.trafficDelay(10);
		System.out.println("Traffic delay = " + res + " min");
//3
		Lesson_01.myAge(38);
//4
		int res1 = Lesson_01.trafficDelay2(11, 31);
		System.out.println("Traffic delay2 = " + res1 + " min");	
	}
	
//1
	public static void fan(int mode) {
		if(mode == 0) {
			System.out.println("Switched off");
		}
		else if(mode == 1) {
			System.out.println("Speed 1");
		}
		else if(mode == 2) {
			System.out.println("Speed 2");
		}
		else if(mode == 3) {
			System.out.println("Turbo");
		}
		else {
			System.out.println("wrong data");
		}
	}
	
//2
	public static int trafficDelay(double hour) {
		int delay = 0;
		if(hour >= 5 && hour <= 7) {
			delay = 15;
		}
		else if(hour > 7 && hour <= 9) {
			delay = 25;
		}
		else if(hour > 9 && hour <= 11.5) {
			delay = 18;
		}
		else if(hour > 11.5 && hour < 13.5) {
			delay = 13;
		}
		else {
			System.out.println("Error: wrong data");
		}
		return delay;
	}

//3
	public static void myAge(int age) {
		if(age >= 0 && age < 18) {
			System.out.println("Child");
		}
		else if(age >= 18 && age < 67) {
			System.out.println("Adult");
		}
		else if(age > 67 && age < 150) {
			System.out.println("Senior");
		}
		else {
			System.out.println("Error: wrong data");
		}
	}

//4
	public static int trafficDelay2(int hour, int min) {
		int delay = 0;
		double time = hour + (double)min/60;
		if(time >= 5 && time <= 7) {
			delay = 15;
		}
		else if(time > 7 && time <= 9) {
			delay = 25;
		}
		else if(time > 9 && time <= 11.5) {
			delay = 18;
		}
		else if(time > 11.5 && time < 13.5) {
			delay = 13;
		}
		else {
			System.out.println("Error: wrong data");
		}
		return delay;
	}
}
