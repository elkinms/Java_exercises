/* Sorting
 * 
 * 1. Sort array minToEnd(int[] ar) 
 * 	  ar -> {9, 2, 7, 5, 3, 1, 8} => {9, 8, 7, 5, 3, 2, 1} (after sortBubble)
 * 
 * 2. Sort array evenToEnd(int[] ar)
 * 	  ar -> {9, 2, 7, 5, 3, 1, 8} => {9, 7, 5, 3, 1, 2, 8} (after sortBubble)
 * 
 * 3. Sort array maxToEndOdd, maxToEndEven
 * 	  ar -> {9, 2, 7, 5, 3, 1, 8};
 * 	        {1, 3, 5, 7, 9, 2, 8};
 */

import java.util.Arrays;

public class Lesson_06 {

	public static void main(String[] args) {
// 1
		int[] ar = {9, 2, 7, 5, 3, 1, 8};
		minToEnd(ar);
		System.out.println(Arrays.toString(ar));
		System.out.println();
		
// 2
		evenToEnd(ar);
		System.out.println(Arrays.toString(ar));
		System.out.println();

// 3
		int[] ar1 = {9, 2, 7, 5, 3, 1, 8};
		maxToEndEvenOdd(ar1);
		// print each value of the array; 
		for(int x: ar1) {
			System.out.print(x + " ");	
		}
	}
	
// 1
	public static void minToEnd(int[] ar) {
		boolean res = true;
		do {
			res = bubbleSortMin(ar);
		} while(res != true);
	}
	
	public static boolean bubbleSortMin(int[] ar) {
		boolean flag = true;
		int temp;
		for(int i = 0; i < ar.length - 1; i++) {
			if(ar[i] < ar[i+1]) {
				temp = ar[i];
				ar[i] = ar[i+1];
				ar[i+1] = temp;
				flag = false;
			}
		}
		return flag;
	}
	
// 2
	public static void evenToEnd(int[] ar) {
		boolean res = true;
		do {
			res = bubbleSortEven(ar);
		} while(res != true);
	}
	
	public static boolean bubbleSortEven(int[] ar) {
		boolean flag = true;
		int temp;
		for(int i = 1; i < ar.length - 1; i++) {
			if(ar[i] % 2 == 0 && ar[i+1] % 2 != 0) {
				temp = ar[i];
				ar[i] = ar[i+1];
				ar[i+1] = temp;
				flag = false;
			}
		}
		return flag;
	}
	
// 3
	public static void maxToEndEvenOdd(int[] ar) {
		boolean res = true;
		do {
			bubbleSortEvenOdd(ar);
		} while(res != true);
	}
	
	public static boolean bubbleSortEvenOdd(int[] ar) {
		boolean flag = true;
		int temp;
		for(int i = 0; i < ar.length - 1; i++) {
			if(ar[i] < ar[i+1] || (ar[i] % 2 == 0 && ar[i+1] % 2 != 0)) {
				temp = ar[i];
				ar[i] = ar[i+1];
				ar[i+1] = temp;
				flag = false;
			}
		}
		return flag;
	}
	
	
}
