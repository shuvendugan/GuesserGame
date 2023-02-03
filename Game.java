import java.util.Scanner;
class Player{
	int pguessNum;
	public int guessNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey Player, Guess the Number.");
		pguessNum = sc.nextInt();
		return pguessNum;
	}
}
class Guesser{
	int guessNum;
	public int guessNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey Guesser, Guess the Number.");
		guessNum = sc.nextInt();
		return guessNum;
	}
}
class Umpair{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	public void numberFromGuesser(){
		Guesser guesser = new Guesser();
		numFromGuesser = guesser.guessNumber();
	}
	public void getNumberFromPlayer(){
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		numFromPlayer1 = p1.guessNumber();
		numFromPlayer2 = p2.guessNumber();
		numFromPlayer3 = p3.guessNumber();

	}
	public void compair(){
		if(numFromGuesser == numFromPlayer1){
			if((numFromGuesser == numFromPlayer2) && (numFromGuesser == numFromPlayer3))
				System.out.println("All are the Winners.");
			else if(numFromGuesser == numFromPlayer2)
				System.out.println("Player 1 and 2 are the winners.");
			else if(numFromGuesser == numFromPlayer3)
				System.out.println("Player 1 and 3 are the winners.");
			else
				System.out.println("Player 1 is the winner.");
		}
		else if(numFromGuesser == numFromPlayer2){
			if(numFromGuesser == numFromPlayer3){
				System.out.println("Player 2 and 3 are the winners.");
			}
			else
				System.out.println("Player 2 is the winner.");
		}
		else if(numFromGuesser == numFromPlayer3)
			System.out.println("Player 3 is the winner.");
		else
			System.out.println("Game Lost! Try again.");
	}
}
public class Game{
	public static void main(String[] args) {
		Umpair umpair = new Umpair();
		umpair.numberFromGuesser();
		umpair.getNumberFromPlayer();
		umpair.compair();
	}
}