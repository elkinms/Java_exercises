import java.util.Scanner;

public class Lesson_04 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intCount = 0, compWin = 0, userWin = 0;
		String input;
		char firstChar = ' ';
		int intComp = 0;
		char charComp  = ' ';
		int max = 3;
		int min = 1;
		
		do {
			intCount++;
			System.out.println("Round № " + intCount +
								"\tComputer: " + compWin +
								"\tUser: " + userWin);
			System.out.print("Enter 'R'(ROCK), 'P'(PAPER), 'S'(SCISSORS) or 'E'(EXIT): ");
			input = scanner.nextLine();
			if(input.isBlank()) {
				System.out.println("The entered text doesn't consisct meaningful symbols."
						+ "\nEnter correct word."
						+ "\nEnter EXIT word to exit");
				continue;
			}
			input = input.toUpperCase();
			firstChar = input.charAt(0); // R P S or E
			if(firstChar == 'E') break;
			if(firstChar != 'R' && firstChar != 'P' && firstChar != 'S' && firstChar != 'E') {
				System.out.println("You didn't enter ROCK, PAPER, SCISSORS or EXIT");
				continue;
				
			}
			intComp = getRandomNumber(1, 3);
			switch(intComp) {
			case 1: charComp = 'R'; break;
			case 2: charComp = 'P'; break;
			case 3: charComp = 'S'; break;	
			default: charComp = 'F';
			}
			
			if(charComp == firstChar) {
				System.out.println("NOW DRAW in the game");
				continue;
			}
			// ++++++ comp R
			if(charComp == 'R' && firstChar == 'P') {
				System.out.println("User WIN! User: " + firstChar +
						" Comp: " + charComp);
				userWin++;
				continue;
			}
			else if(charComp == 'R' && firstChar == 'S') {
				System.out.println("Comp WIN! User: " + firstChar +
						" Comp: " + charComp);
				compWin++;
				continue;
			}
			// ++++++ comp S
			if(charComp == 'S' && firstChar == 'R') {
				System.out.println("User WIN! User: " + firstChar +
						" Comp: " + charComp);
				userWin++;
				continue;
			}
			else if(charComp == 'S' && firstChar == 'P') {
				System.out.println("Comp WIN! User: " + firstChar +
						" Comp: " + charComp);
				compWin++;
				continue;
			}			
			// ++++++ comp P
			if(charComp == 'P' && firstChar == 'S') {
				System.out.println("User WIN! User: " + firstChar +
						" Comp: " + charComp);
				userWin++;
				continue;
			}
			else if(charComp == 'P' && firstChar == 'R') {
				System.out.println("Comp WIN! User: " + firstChar +
						" Comp: " + charComp);
				compWin++;
				continue;
			}				
			
		}
		while(firstChar != 'E');
		System.out.println("Game OVER. Bye-bye");
		
		
	}
	static int getRandomNumber(int min, int max) {
		return (int)(min+Math.random()*(max-min+1));
		
	}
}
