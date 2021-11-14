Nusrat Atiya
Read Me: HW 2


Hangman Class:
In the selectGameWord() method, I inserted a toUpperCase() when picking a random index from the array of words so that for the rest of the game, it is compared to an uppercase set of letters in the correct word.


I used two getCurrentWord() methods because one was for initializing the game (it returns an empty string of underscores) & when it doesn’t need to be updated (i.e the user guess was wrong) and the other one was for when there was an actual guess to input (it returns a char[]) in the parameter. 


The same idea applies to the getIncorrectGuesses() methods. However, the getIncorrectGuesses() has uneven spacing when it prints the incorrectList. 


Hangman Driver:
The static methods outside of the main() method all serve to deal with user inputs and I inserted a toUpperCase() to each response so that it words with the hangman class (the correct word is in uppercase) and that regardless of whether the user’s input is in lower or upper case, it turns into upper case. In the main method, when the correct word is revealed, I inserted a toLowerCase() to replicate the example in the homework explanation. 
In the main method, I used two booleans: one for if the player was still playing the game and one for if the guess was still false and created a nested while loop. In order to check if the guessed letters equaled the correct word, I needed to convert the getCurrentWord from a char[] to a string and use the equals method, otherwise I wouldn’t have been able to compare them in the for loop (line 40). 


When the game ends  and the player wants to play again, I used the setter and getter methods in order to re-initialize the variables because otherwise, it would hold the memory of the variables from the previous game. I had to reset the dispArr, dispWord and incorrectList and assign the numIncorrect to 0, so the game completely resets. Then, I set the guessing boolean back to false so it would go back to the inner loop.