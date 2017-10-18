package exercises.reusing;

class A1 { A1(){ System.out.println("A1()");} }

class B1 extends A1 { B1(){ System.out.println("B1()");} }

class C1 extends A1 { 
	B1 b = new B1(); // will then construct another A and then a B
	public static void main(String[] args) {
		C1 c = new C1(); // will construct an A first
	}
}
/*
 * Output:
 * A1()
 * A1()
 * B1()
 * */
