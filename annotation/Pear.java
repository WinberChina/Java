package anno.test;

public class Pear {
	@FruitName("Pear")
	private String pearName;
	@FruitColor(fruitColor = FruitColor.Color.GREEN)
	private String pearColor;
	@FruitProvider(id = 1, name = "��̨Ѽ�湩Ӧ��", address = "��̨�������깴�")
	private String pearProvider;

	public String getPearName() {
		return pearName;
	}

	public void setPearName(String pearName) {
		this.pearName = pearName;
	}

	public String getPearColor() {
		return pearColor;
	}

	public void setPearColor(String pearColor) {
		this.pearColor = pearColor;
	}

	public String getPearProvider() {
		return pearProvider;
	}

	public void setPearProvider(String pearProvider) {
		this.pearProvider = pearProvider;
	}

	public void displayName() {
		System.out.println("ˮ���������ǣ���");
	}

}
