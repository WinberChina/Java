package chapters.reusing;

public class SpaceShipDelegation {
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	public SpaceShipDelegation(String name) {
		this.name = name;
	}
	public void up(int velocity) {
		controls.up(velocity);
	}
	public void down(int velocity) {
		controls.up(velocity);
	}
	public void left(int velocity) {
		controls.left(velocity);
	}
	public void right(int velocity) {
		controls.right(velocity);
	}
	public void forward(int velocity) {
		controls.forward(velocity);
	}
	public void back(int velocity) {
		controls.back(velocity);
	}
	public void turboBoost() {
		controls.turboBoost();
	}
	public String toString() {
		return name;
	}
}
