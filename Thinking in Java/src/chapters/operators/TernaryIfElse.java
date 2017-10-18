package chapters.operators;

import print.Print;

public class TernaryIfElse {
	static int ternary(int i){
		return i < 10 ? i*100:i*10;
	}
	
	static int standardIfElse(int i){
		if(i < 10){
			return i * 100;
		}else{
			return i*10;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print.print(String.valueOf(ternary(9)));
		Print.print(String.valueOf(ternary(10)));
		Print.print(String.valueOf(standardIfElse(9)));
		Print.print(String.valueOf(standardIfElse(10)));
	}

}
