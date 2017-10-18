package exercises.control;

// control/CompareIntsForever.java
// TIJ4 Chapter Control, exercises 3, page 139
// Modify exercises 2 wtih infinte while loop. Stop prgram with Ctrl-C

import java.util.*;

import print.Print;

public class CompareIntsForever {
	public static void main(String[] args) {
		Random rand1 = new Random();
		Random rand2 = new Random();
		for(int i = 0; i < 25; i++) {
			int x = rand1.nextInt();
			int y = rand2.nextInt();
			if(x < y) Print.print(x + " < " + y);
			else if(x > y) Print.print(x + " > " + y);
			else Print.print(x + " = " + y);
		}
		Random rand3 = new Random();
		Random rand4 = new Random();
		while(true) {
		//for(int i = 0; i < 25; i++) {
			int x = rand3.nextInt(10);
			int y = rand4.nextInt(10);
			if(x < y) Print.print(x + " < " + y);
			else if(x > y) Print.print(x + " > " + y);
			else Print.print(x + " = " + y);
		}
	}
}