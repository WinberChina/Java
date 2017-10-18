package chapters.operators;

import print.Print;

//: operators/Literals.java

public class Literals {
  public static void main(String[] args) {
    int i1 = 0x2f; // Hexadecimal (lowercase)
    Print.print("i1: " + Integer.toBinaryString(i1));
    int i2 = 0X2F; // Hexadecimal (uppercase)
    Print.print("i2: " + Integer.toBinaryString(i2));
    int i3 = 0177; // Octal (leading zero)
    Print.print("i3: " + Integer.toBinaryString(i3));
    char c = 0xffff; // max char hex value
    Print.print("c: " + Integer.toBinaryString(c));
    byte b = 0x7f; // max byte hex value
    Print.print("b: " + Integer.toBinaryString(b));
    short s = 0x7fff; // max short hex value
    Print.print("s: " + Integer.toBinaryString(s));
    long n3 = 200;
    float f1 = 1;
    float f2 = 1F; // float suffix
    float f3 = 1f; // float suffix
    double d1 = 1d; // double suffix
    double d2 = 1D; // double suffix
    long n1 = 0xffff; // hexadecimal
	long n2 = 077777; // octal
	Print.print("long n1 in hex = " + Long.toBinaryString(n1));
	Print.print("long n2 in oct = " + Long.toBinaryString(n2));
    // (Hex and Octal also work with long)
  }
} /* Output:
i1: 101111
i2: 101111
i3: 1111111
c: 1111111111111111
b: 1111111
s: 111111111111111
*///:~
