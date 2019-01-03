import java.util.Scanner;
import java.lang.Math;

public class HighLow {

	public static void main(String[] args) {
		
		Scanner keyInput = new Scanner(System.in);			//Scanner method
		
		String yesPlayAgain = "";							// play the game again?
		int numOfGuesses = 0;
		
		 do {
			 												//Random number generator method starts here
		int aNumber = (int) (Math.random() * 200 - 100); 	// type cast to integer to get rid of decimal. + min represents possible results
														    // Include () around Math... so calculation runs before type casting for the correct result
														    // multiply range. 
		
		int userGuess = 0; 								// integer starting value of -100	
		 
		 System.out.println("Welcome to the Guessing Game!");
		 System.out.print("Guess a number from -100 to 1000 and enter it here: ");  
		 
		 while (userGuess != aNumber) {
		
		 userGuess = keyInput.nextInt();						//Scanner reads user input
		 numOfGuesses++;
		 
	     if (userGuess < aNumber) 
	    	System.out.println("Your guess " + userGuess + " is too LOW. Guess again.");
	     else if (userGuess > aNumber) 
			System.out.println("Your guess " + userGuess + " is too HIGH. Try again.");
	     else 
	    	System.out.println("Congratulations! You guessed " + userGuess + " which is the correct number! It took you " + numOfGuesses + " tries to guess the correct number!");
		 } 												// end of do-while loop here
	    												
	    System.out.println("Would you like to play again? Type yes or no: ");   //Prompt user to play again
	    	yesPlayAgain = keyInput.next();
		} while (yesPlayAgain == "yes");
	    		System.out.println("Guess a number from -100 to 1000 and enter it here: ");
    
		keyInput.close();									//close Scanner
		
		 }
	}










/*Write a JAVA program to implement a user friendly guessing game.

Setup:  New Java Project, type HighLow in the Project name field, click Finish. Create a class called HighLow.  

Requirements:
Generate a random number between -100 and 1000 for the user to guess.
	Display a prompt, or a line of text, asking the user to guess a number in that range.
Accept the user’s guess as input.
Compare the user’s guess to the computer’s number to see if the guess too high, low or correct.
Display the results on the screen.
	Prompt the user to guess another number until they guess correctly.
	Ask the user if they would like to play again.
Count the user’s tries to get the correct answer and display on win.
MadLibs Code
Upload to your GitHub


STEPS

- Planning the Game Step-by-Step
- Creating a New Java Project
- Creating the HighLow Class
- Generating a Random Number
- Getting User Input from the Keyboard
- Making the Program Print Output
- Loops: Ask, Check, Repeat
- if Statements: Testing for the Right Conditions
- Adding a Play Again Loop
- Testing the Game

OPTIONAL: 

GUI
Create a GUI for your game (when starting your new class use javax.swing.JFrame as the Superclass, this will extend the JFrame class to your game)
Open with the WindowBuilderEditor (will open a new file of same name)
Click the Design tab below the source code
Label your GUI window 
Have an input field for the user guesses
Have a play again button

Things to think about:
Use loops where appropriate, ask, check, repeat if needed.
Use if statements to test for the right conditions
Did you close your Scanner class??

/*Directions for opening WindowBuilder

Go to File -> New -> Other. ...
Double click in WindowBuilder folder and then to Swing Designer subfolder.
Click to the Application Window and then click Next.
Give a Name for your new window and then click Finish. ...
Press Run (the "Play" icon of the toolbar) to run your newly created window.
Press the Design tab at the bottom of the Eclipse page - next to the Source tab


MadLibs

For your final challenge, let’s write a completely new program. 

We’ve learned how to ask a user for input and store it in a variable. We’ve also learned how to print out both text and variable values to the screen. With those skills, you can build even more interesting and fun programs.

Have you ever played MadLibs? 

Let’s try to use our new skills to build a program in that same style. 

MadLibs asks a player for various words or parts of speech, such as a color, a past-tense verb, or an adjective, and then inserts the words the player chose into a template, usually resulting in a funny story. For example, if a player gave a color of “pink,” a past-tense verb of “burped,” and an adjective of “silly” and then inserted them into the template “The ____ dragon ____ at the ____ knight,” they would get the result “The pink dragon burped at the silly knight.”

Now, the challenge is to write a new program, MadLibs.java, with a class called MadLibs and a main() method that prompts the user for several words. Those words should each be stored in a different String variable, like color, pastTenseVerb, adjective, and noun, which you initialize as empty strings. 

Then, after the user has entered their last word, the program should print a completed sentence or story by replacing the empty strings with the words the user provided, like this:

System.out.print("The " + color + " dragon " + pastTenseVerb + " at the " + adjective);
System.out.println(" knight, who rode in on a sturdy, giant " + noun + ".");


Note that the first statement is a print() statement instead of a println(). The print() statement continues printing at the end of the same line, allowing us to build a longer paragraph or story. The println() statement, however, always skips a line after printing, like when you press ENTER at the end of the line. 

You can write a longer MadLibs story by using different variable names like noun1, noun2, and noun3. Give it a try, and get ready to laugh at the funny stories you create! Try to personalize each program you create by adding new features and making it your own.

OPTIONAL FOR MADLIBS:
-Can you make this output into a pop-up window to display your complete story?



*/