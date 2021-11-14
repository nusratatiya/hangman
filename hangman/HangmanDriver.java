import java.util.Scanner;

public class HangmanDriver {
	static int numIncorrect = 0;
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		//initializing
		Hangman game = new Hangman();
		boolean nowPlaying = true;
		boolean guessing = false;
		game.setWords();
		
		while (nowPlaying == true) {
			// initial set-up of game
			
			String word = game.selectGameWord();
			System.out.println("Welcome to Hangman!");
			System.out.println("Generating a secrete word...");
			System.out.println("Here is your Word: ");
			System.out.println(game.getCurrentWord()); 
			game.showMan(numIncorrect); 
			game.getIncorrectGuesses(' '); 
			
			while (numIncorrect <10 && guessing == false) {
				
				char c = getChoice();
				if (c == 'L') { //letter guess
					char g = getGuessL(); // obtains letter guess
					
					if (word.contains(Character.toString(g))) {  // if guess is right
						
						System.out.println("Correct!");
						System.out.println(game.getCurrentWord(g)); 
						game.showMan(numIncorrect);
						game.getIncorrectGuesses();
						
						String currentWordString = String.copyValueOf(game.getCurrentWord(g)); 
						
						if (word.equals(currentWordString)) { //checks if guessed work equals correct word
							System.out.println("You win!"); 
							break;
						}
						
						if (numIncorrect >= 10) { // if guesses exceed 10, automatically lose
							System.out.println("You lose :(");
							break;
						} 
					}
					
					else { // if guess is wrong
						System.out.println("Incorrect :(");
						numIncorrect++;
						System.out.println(game.getCurrentWord(g));
						game.showMan(numIncorrect);
						game.getIncorrectGuesses(g);
					}
				}
				
				if (c=='W') { // word guess
					String w = getGuessW();
					if (w.equals(word)) { 
						System.out.println("Correct!");
						System.out.println("You win!");
						break;
					}
					else {
						System.out.println("You lose :(");
						break;
					}
				}
			}
			
			System.out.println("The word was: " + word.toLowerCase());
			System.out.println("Play again: Yes(Y) or No(N)");
			String playAgain = scan.nextLine().toUpperCase();
			
			if (playAgain.equals("Y")) { 
				
				game.setDispWord("-------");
				game.setDispArr(game.getDispWord().toCharArray()); 
				numIncorrect=0; //
				game.setIncorrectList(" ");
				guessing = false; // goes back to inner loop so player can play again
			}
			if (playAgain.equals("N")) {
				System.out.println("Goodbye!");
				nowPlaying = false; // breaks out of outer loop and ends game completely
				
			}
		}
		
	}
	
	public static char getChoice() {
		//asks player to choose between letter or word guess
		System.out.println("Type L to guess a letter or W to guess a word: ");
		char choiceResponse = scan.nextLine().toUpperCase().charAt(0);
		return choiceResponse;
	}
	
	public static char getGuessL() {
		// gets the players letter guess
		System.out.println("Enter your guess (as a single letter): ");
		char letterGuess = scan.nextLine().toUpperCase().charAt(0);
		return letterGuess;
	}
	
	public static String getGuessW() {
		// gets the players word guess
		System.out.println("Enter your guess (as a word): ");
		String wordGuess = scan.nextLine().toUpperCase();
		return wordGuess;
	}

}
