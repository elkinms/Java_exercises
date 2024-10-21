
public class Lesson_05 {

	public static void main(String[] args) {
	//1
	int[] ar = {1, 3, 4, 4, 5, 6, 7};
	int[] ar1 = {-1, 3, -4, 4, -5, 6, 7};
	int res = Lesson_05.arrayOddsSum(ar);
	System.out.println(res);
	
	//2
	int min = Lesson_05.searchMin(ar);
	System.out.println(min);
	
	//3
	int minIndex = Lesson_05.searchMinIndex(ar);
	System.out.println("MinIndex = " + minIndex);
	
	//4
	int[] finalArr = Lesson_05.mergeArrays(ar, ar1);
	for(int i = 0; i < finalArr.length; i++) {
		System.out.print(" " + finalArr[i]);
	}
	
	}
 
	/* 1. public static int arrayOddsSum(int[] ar)
	 * example:
	 * 		 0  1  2  3  4  5
	 * ar-> [9][2][4][6][7][1]
	 * calculate sum of odds in array = 9 + 7 + 1 = 17
	 * return 17 
	 */
	public static int arrayOddsSum(int[] ar) {
		int sum = 0;
		for(int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 != 0) {
				sum += ar[i];
			}
		}
		return sum;
	}
	  
	/* 2. public static int searchMin(int[] ar)
	 * example:
	 * 		 0  1  2  3  4  5
	 * ar-> [9][-2][4][6][7][1]
	 * return - 2
	 */
	public static int searchMin(int[] ar) {
		int min = ar[0];
		for(int i = 1; i < ar.length; i++) {
			if(ar[i] < min) {
				min = ar[i];
			}
		}
		return min;
	}

	/* 3. public static int searchMinIndex(int[] ar)
	 * example:
	 * 		 0  1  2  3  4  5
	 * ar-> [9][-2][4][6][7][1]
	 * find min element in array and return index of min
	 * return 1
	 */
	public static int searchMinIndex(int[] ar) {
		int minIndex = 0;
		int min = ar[0];
		for(int i = 1; i < ar.length; i++) {
			if(ar[i] < min) {
				min = ar[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	/* 4. public static int[] mergeArrays(int[] ar1, int[] ar2)
	 * ar1.length = 4  	     ar2.length = 3    size = 7
	 * ar1 -> [3][1][5][7]   ar2 -> [4][2][6]
	 * ar3 -> [1][2][3][4][5][6][7]
	 * without sorting
	 */
	public static int[] mergeArrays(int[] ar1, int[] ar2) {
		int size = ar1.length + ar2.length;
		int[] mergedArr = new int[size];
		for(int i = 0; i < ar1.length; i++) {
			mergedArr[i] = ar1[i];
		}
		for(int i = 0; i < ar2.length; i++) {
			mergedArr[ar1.length + i] = ar2[i];
		}
		int[] finalArr = new int[size];
		for(int i = 0; i < size; i++) {
			int min = mergedArr[0];
			int minIndex = 0;
			for(int j = 0; j < size; j++) {
				if(mergedArr[j] < min) {
					min = mergedArr[j];
					minIndex = j;
				}
			}
			finalArr[i] = min;
			mergedArr[minIndex] = Integer.MAX_VALUE;
		}
		return finalArr;
	}

}
