package exercises.control;

/*public class FibonacciTest {
	static void fabonacci(int value) {
		int a = 1, b = 1;
		if(value < 1) {
			System.out.println("fabonacci error , number should not be less than 1");
		} else if(value == 1) {
			System.out.print("1, 1");
		} else {
			System.out.print("1, 1");
			for(int t = a + b; t <= value; t = a + b) {
				System.out.print(", " + t);
				a = b;
				b = t;
			}
		}
	}
	*//**
	 * @param args
	 *//*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fabonacci(21);
	}

}*/

//control/Fibonacci.java
//TIJ4 Chapter Control, exercises 9, page 153
/* A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34,
* and so on, where each number (from the third on) is the sum of the previous
* two. Create a method that takes an integer as an argument and displays that
* many Fibonacci numbers starting from the beginning, e.g.,if you run java
* Fibonacci 5 (where Fibonacci is the name of the class) the output will be
* 1,1,2,3,5.
*/

public class FibonacciTest {
	int fib(int n) {
		if(n < 2) return 1;
		return (fib(n - 2) + fib(n - 1));
	}
	public static void main(String[] args) {
		FibonacciTest f = new FibonacciTest();
		int k = Integer.parseInt(args[0]);
		System.out.println("First " + k + " Fibonacci number(s): ");
		for(int i = 0; i < k; i++)
			System.out.println(f.fib(i));
	}	
}
