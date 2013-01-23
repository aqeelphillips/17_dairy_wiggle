public class Moover extends Employee {
	public Moover(String n) {
		super(200, n, "Moover");
	}
	
	public void takeOrder() {
		setEffectivenessMultiplier(roundify((getEffectivenessMultiplier() + 0.05), 2));
		checkForget(20);
	}
	
	public void deliverShake() {
		setEffectivenessMultiplier(roundify((getEffectivenessMultiplier() + 0.03), 2));
		checkForget(5);
	}
	
	public void checkForget(double chance) {
		if (calcChance(chance)) { setEffectivenessMultiplier(getEffectivenessMultiplier() - 0.1); }
	}
	
	public void work() {
		takeOrder();
		deliverShake();
	}
}