import java.util.Random;

public class Hangman {
	private int numwords = 10;
	private String[] words = new String[numwords];
	private String gameWord;
	private String dispWord = "-------";
	private char[] dispArr = dispWord.toCharArray();
	private String incorrectList = " ";
	
	Random rand = new Random();
	
	public Hangman() {} // empty constructor
	
	/**
	  Sets the list of candidate words for the player to guess
	**/
	public void setWords()
	{ // creates word bank 
		words[0] = "notions";
		words[1] = "measure";
		words[2] = "product";
		words[3] = "foliage";
		words[4] = "garbage";
		words[5] = "minutes";
		words[6] = "chowder";
		words[7] = "recital";
		words[8] = "concoct";
		words[9] = "brownie";
	}
	
	public String selectGameWord() {
		// randomly select word from words array
		int randomIndex = rand.nextInt(words.length);
		this.gameWord = words[randomIndex].toUpperCase();
		return gameWord;
		
	}
	
	public String getCurrentWord() {
		//updates + returns current state of guess
		return dispWord;
	}
	
	public char[] getCurrentWord(char guess) {
		//updates + returns current state of guess
		
		for (int i=0; i < gameWord.length(); i++) {
			if (gameWord.charAt(i) == guess)
				dispArr[i] = guess;
				
		}
		return dispArr;
	}
	
	public void getIncorrectGuesses() {
		// returns or prints list of incorrect guesses
		
		System.out.println("Incorrect guesses: " + incorrectList);
	}
	
	public void getIncorrectGuesses(char guess) {
		// returns or prints list of incorrect guesses
		
		
		incorrectList += guess + " ";
		System.out.println("Incorrect guesses: " + incorrectList);
	}
	
	
	
	/*
	 * Returns the number of words to choose from
	 */
	
	public int getNumWords()
	{
		return numwords;
	}
	
	/*
	 * Returns the array of words
	 */
	public String[] getWords()
	{
		return words;
	}
	
	
	
	/*Method to display the hangman given the number of body parts to show
	 * Player gets at most 10 turns. */
	public void showMan(int numParts)
	{
		if (numParts == 0){
		System.out.println("________");
		System.out.println("|       |");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("____");
		}
		if (numParts == 1){
		System.out.println("________");
		System.out.println("|       |");
		System.out.println("|      ____");
		System.out.println("|     / .. \\");
		System.out.println("|    <   .  >");
		System.out.println("|     \\__^_/");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("____");
		}
		if (numParts == 2){
		System.out.println("________");
		System.out.println("|       |");
		System.out.println("|      ____");
		System.out.println("|     / .. \\");
		System.out.println("|    <   .  >");
		System.out.println("|     \\__^_/");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("____");
		}
		if (numParts == 3){
		System.out.println("________");
		System.out.println("|       |");
		System.out.println("|      ____");
		System.out.println("|     / .. \\");
		System.out.println("|    <   .  >");
		System.out.println("|     \\__^_/");
		System.out.println("|        |");
		System.out.println("|      __|");
		System.out.println("|        |");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("____");
		}
		if (numParts == 4){
		System.out.println("________");
		System.out.println("|       |");
		System.out.println("|      ____");
		System.out.println("|     / .. \\");
		System.out.println("|    <   .  >");
		System.out.println("|     \\__^_/");
		System.out.println("|        |");
		System.out.println("|     o__|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("____");
		}
		if (numParts == 5){
		System.out.println("________");
		System.out.println("|       |");
		System.out.println("|      ____");
		System.out.println("|     / .. \\");
		System.out.println("|    <   .  >");
		System.out.println("|     \\__^_/");
		System.out.println("|        |");
		System.out.println("|     o__|__");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("____");
		}
		if (numParts == 6){
		System.out.println("________");
		System.out.println("|       |");
		System.out.println("|      ____");
		System.out.println("|     / .. \\");
		System.out.println("|    <   .  >");
		System.out.println("|     \\__^_/");
		System.out.println("|        |");
		System.out.println("|     o__|__o");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("____");
		}
		if (numParts == 7){
		System.out.println("________");
		System.out.println("|       |");
		System.out.println("|      ____");
		System.out.println("|     / .. \\");
		System.out.println("|    <   .  >");
		System.out.println("|     \\__^_/");
		System.out.println("|        |");
		System.out.println("|     o__|__o");
		System.out.println("|");
		System.out.println("|       /");
		System.out.println("|      /  ");
		System.out.println("|");
		System.out.println("|");
		System.out.println("____");
		}
		if (numParts == 8){
		System.out.println("________");
		System.out.println("|       |");
		System.out.println("|      ____");
		System.out.println("|     / .. \\");
		System.out.println("|    <   .  >");
		System.out.println("|     \\__^_/");
		System.out.println("|        |");
		System.out.println("|     o__|__o");
		System.out.println("|");
		System.out.println("|       / \\");
		System.out.println("|      /   \\");
		System.out.println("|");
		System.out.println("|");
		System.out.println("____");
		}
		if (numParts == 9){
		System.out.println("________");
		System.out.println("|       |");
		System.out.println("|      ____");
		System.out.println("|     / .. \\");
		System.out.println("|    <   .  >");
		System.out.println("|     \\__^_/");
		System.out.println("|        |");
		System.out.println("|     o__|__o");
		System.out.println("|");
		System.out.println("|       / \\");
		System.out.println("|      /   \\");
		System.out.println("|    O/    ");
		System.out.println("|");
		System.out.println("____");
		}
		if (numParts == 10){
		System.out.println("________");
		System.out.println("|       |");
		System.out.println("|      ____");
		System.out.println("|     / .. \\");
		System.out.println("|    <   .  >");
		System.out.println("|     \\__^_/");
		System.out.println("|        |");
		System.out.println("|     o__|__o");
		System.out.println("|");
		System.out.println("|       / \\");
		System.out.println("|      /   \\");
		System.out.println("|    O/     \\O");
		System.out.println("|");
		System.out.println("____");
	}
	}
	
	// setters and getters for all private variables
	

	public String getGameWord() {
		return this.gameWord;
	}

	public void setGameWord(String gameWord) {
		this.gameWord = gameWord;
	}

	public String getDispWord() {
		return this.dispWord;
	}

	public void setDispWord(String dispWord) {
		this.dispWord = dispWord;
	}

	public char[] getDispArr() {
		return this.dispArr;
	}

	public void setDispArr(char[] dispArr) {
		this.dispArr = dispArr;
	}

	public void setWords(String[] words) {
		this.words = words;
	}

	public void setIncorrectList(String lst) {
		this.incorrectList = lst;
	}
	
	
	
	
}
