public class Shaker extends Employee {
	public Shaker(String n) {
		super(100, n, "Shaker");
	}
	
	public void shake() {
		setEffectivenessMultiplier(roundify((getEffectivenessMultiplier() + 0.02), 2));
	}
	
	public void work() {
		shake();
	}
}