package exercises.initialization;


public class EnumExt21 {
	
	public enum PaperCurrency {
		ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
	}
	
	public static void main(String[] args) {
		for(PaperCurrency c : PaperCurrency.values()) {
			System.out.println(c + ", ordinal " + c.ordinal());
		}
	}
}
