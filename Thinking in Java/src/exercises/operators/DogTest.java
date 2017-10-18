package exercises.operators;

import print.Print;

public class DogTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog("spot", "Ruff");
		Dog dog2 = new Dog("scruffy", "Wurf");
		dog1.showName();
		dog1.speak();
		dog2.showName();
		dog2.speak();
	}

}

class Dog {
	String name;
	String says;
	Dog(String name, String says){
		this.name = name;
		this.says = says;
	}
	void setName(String n){
		name = n;
	}
	void setSays(String s){
		says = s;
	}
	void showName(){
		Print.print(name);
	}
	void speak(){
		Print.print(says);
	}
}