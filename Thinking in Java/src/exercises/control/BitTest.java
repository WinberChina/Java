package exercises.control;

import print.Print;

// control/BitTest.java
// TIJ4 Chapter Control, exercises 5, page 140
/* Repeat exercises 10 from the last chapter using the ternary operator and a
* bitwise test to display the ones and zeros, instead of Integer.toBinaryString()
*/ 


public class BitTest {
	static void binaryPrint (int q) {
		if(q == 0) System.out.print(0);
		else {
			int nlz = Integer.numberOfLeadingZeros(q); 
			q <<= nlz;
			for(int p = 0; p < 32 - nlz; p++) {
				int n = (Integer.numberOfLeadingZeros(q) == 0) ? 1 : 0;
				System.out.print(n);		
				q <<= 1;
			}		
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int i = 1 + 4 + 16 + 64;
		int j = 2 + 8 + 32 + 128;
		int k = 0x100;
		int m = 0;
		Print.print("Using Integer.toBinaryString():");
		Print.print("i = " + Integer.toBinaryString(i));
		Print.print("j = " + Integer.toBinaryString(j));
		Print.print("k = " + Integer.toBinaryString(k));
		Print.print("m = " + Integer.toBinaryString(m));		
		Print.print("i & j = " + (i & j) + " = " + Integer.toBinaryString(i & j));
		Print.print("i | j = " + (i | j) + " = " + Integer.toBinaryString(i | j));
		Print.print("i ^ j = " + (i ^ j) + " = " + Integer.toBinaryString(i ^ j));
		Print.print("~i = " + Integer.toBinaryString(~i));
		Print.print("~j = " + Integer.toBinaryString(~j));
		Print.print("Using binaryPrint():");
		Print.print("i = " + i + " = ");
		binaryPrint(i);		
		Print.print("j = " + j + " = ");
		binaryPrint(j);
		Print.print("k = " + k + " = ");
		binaryPrint(k);		
		Print.print("m = " + m + " = ");
		binaryPrint(m);
		Print.print("i & j = " + (i & j) + " = ");
		binaryPrint(i & j);
		Print.print("i | j = " + (i | j) + " = ");
		binaryPrint(i | j);
		Print.print("i ^ j = " + (i ^ j) + " = ");
		binaryPrint(i ^ j);
		Print.print("~i = " + ~i + " = ");
		binaryPrint(~i);		
		Print.print("~j = " + ~j + " = ");
		binaryPrint(~j);
	}	
}