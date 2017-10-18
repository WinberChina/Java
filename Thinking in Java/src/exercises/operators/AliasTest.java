package exercises.operators;
class EggWeight {
	float weight;
}

public class AliasTest {
	public static void main(String [] args){
		EggWeight eW1 = new EggWeight();
		EggWeight eW2 = new EggWeight();
		eW1.weight = 0.9f;
		eW2.weight = 0.47f;
		System.out.println("1: eW1.weight: " + eW1.weight + ", eW2.weight: " + eW2.weight);
		eW1=eW2;
		System.out.println("2: eW1.weight: " + eW1.weight + ", eW2.weight: " + eW2.weight);
		eW1.weight = 0.2f;
		System.out.println("3: eW1.weight: " + eW1.weight + ", eW2.weight: " + eW2.weight);
	}
}
