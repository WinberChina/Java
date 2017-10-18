package exercises.operators;

import java.util.Random;

import print.Print;

public class CoinFlipping {
	public static void main(String[] args){
		Random rand = new Random();
		int coin = rand.nextInt();
		Print.print("coin=" + coin);
		if(coin % 2 == 0) 
			Print.print("heads");
		else 
			Print.print("tails");
	}
}
