// ****************************************************************
//   Program Name: JellyBeanGame.java - SKELETON CODE for STEP 1
//  
//   Author :  Will Schuhmann
//
//   Date : 10/18/2018
//   Description:
//   Play a game where the user tries to guess the
//   number of jellybeans in a jar.  Can range from 1 to 1000
//   
//   Uses a do..while loop.
//
// ****************************************************************

import java.util.Scanner;
import java.util.Random;

public class JellyBeanGame
{
    public static void main(String[] args)
    {
        int numOfJellyBeans = 0;
        int guess = 0; 
        int numGuess = 0;
        boolean playagain;
		 Random generator = new Random();
		 Scanner scan = new Scanner (System.in);
		 numOfJellyBeans = (int)((Math.random()*((1000-1)+1))+1);
	System.out.println(numOfJellyBeans);
		System.out.println("There are between 1 and 1000 jellybeans in the jar.");
		System.out.println("How many do you think are in the jar?");
	do{
		numGuess=numGuess+1;
		playagain=false;
		System.out.println("Enter your guess: ");
		guess = scan.nextInt();
		if (guess>numOfJellyBeans) {
			System.out.println("Too High!");
		}else if (guess<numOfJellyBeans) {
			System.out.println("Too Low!");
		}else if (guess==numOfJellyBeans) {
			System.out.println("High Five! You got it after " + numGuess + " guesses.");
			System.out.println("Would you like to play again? Yes or No?");
			switch (scan.next()) {
			case "Yes":
				playagain=true;
				break;
			default:
				break;
			}
		}
	}while (guess != numOfJellyBeans);
    } 
}
