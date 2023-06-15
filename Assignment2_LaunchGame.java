package Game;

import java.util.Scanner;

class Guesser{
	int num;
	int GuessNum() {	
		Scanner sc = new Scanner(System.in);
		do {
		if(num<0 || num>10)
			System.out.println("The entered number is not within the range ");
		System.out.println("Guesser kindly give any number between 0-10 inclusive ");
		num =sc.nextInt();
		}while(num<0 || num>10);
		return num;
	}
}

 class Umpire {
	 
	 int numFromGuesser,winners=0;
	 int numFromPlayers[] = new int[10];

	 void collectNumFromGuesser() {
		 Guesser g =  new Guesser();
		 numFromGuesser = g.GuessNum();
	 }
	 
	 void collectNumFromAllPlayers(int count) {
		 Players p[] = new Players[count]; // Allocating memory for count no.of objects of type players
		 for(int i=0;i<count;i++) {
			 p[i] = new Players(); // Creating actual player objects
			 numFromPlayers[i] = p[i].GuessANum(i+1);
			 }
	 }
	 
	 int[] compareNum(int[] numFromPlayers,int numFromGuesser) {
		 int res[] = new int[10];
		 int j=0;
		 for(int i=0;numFromPlayers[i]!='\0';i++) {
				if(numFromGuesser == numFromPlayers[i]) {
					res[j++] = i+1;
					winners++;
				}
			 }
		 return res;
	 }
	 
	 int[] startGame(int count) {
		 collectNumFromGuesser();
		 collectNumFromAllPlayers(count);
		 int[] res = compareNum(numFromPlayers,numFromGuesser);
		 return res;
	 }
	
	 void displayRes(int count) { 
		 int res[] = startGame(count);
		 if(winners == 0) {
			 System.out.println("Game lost... TRY AGAIN");
		 }
		 else if (winners >1) {
			 System.out.println("The winners are");
			 for (int i=0;res[i]!='\0';i++) 
				 System.out.println("player " + res[i]);
		 }
		 else {
			 System.out.println("The winner is");
			 System.out.println("player " + res[0]);
		 } 
		 }
	 
	 
}
 

class Players{
	int num;
	int GuessANum(int j) {
		Scanner sc  = new Scanner(System.in);
		do {
		if(num<0 || num>10)
			System.out.println("The entered number is not within the range ");
		
		System.out.println("Player "+j+ " ...Guess the number between 0-10 inclusive- ");
		num = sc.nextInt();
		}while(num<0 || num>10);
		return num;
	}
}

public class Assignment2_LaunchGame {
	public static void main(String[] args) {
		Umpire em = new Umpire();
		System.out.println("enter no.of players playing the todays game");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		em.displayRes(count);
	}
}
